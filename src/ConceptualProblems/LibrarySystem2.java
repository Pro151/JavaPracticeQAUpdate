package ConceptualProblems;

class Book {
    private String title;
    private String author;
    private boolean borrowed;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.borrowed = false;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isBorrowed() {
        return borrowed;
    }

    public void borrow() {
        if (!borrowed) {
            borrowed = true;
            System.out.println("ConceptualProblems.Book " + title + " by " + author + " is borrowed.");
        } else {
            System.out.println("ConceptualProblems.Book " + title + " is already borrowed.");
        }
    }

    public void returnBook() {
        if (borrowed) {
            borrowed = false;
            System.out.println("ConceptualProblems.Book " + title + " by " + author + " is returned.");
        } else {
            System.out.println("ConceptualProblems.Book " + title + " was not borrowed.");
        }
    }
}

class Library {
    private Book[] books;

    public Library(int size) {
        books = new Book[size];
    }

    public void addBook(Book book) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = book;
                System.out.println("ConceptualProblems.Book " + book.getTitle() + " added to the library.");
                return;
            }
        }
        System.out.println("ConceptualProblems.Library is full. Cannot add " + book.getTitle());
    }

    public void borrowBook(String title) {
        for (Book book : books) {
            if (book != null && book.getTitle().equals(title)) {
                book.borrow();
                return;
            }
        }
        System.out.println("ConceptualProblems.Book " + title + " not found in the library.");
    }

    public void returnBook(String title) {
        for (Book book : books) {
            if (book != null && book.getTitle().equals(title)) {
                book.returnBook();
                return;
            }
        }
        System.out.println("ConceptualProblems.Book " + title + " not found in the library.");
    }
}

public class LibrarySystem2 {
    public static void main(String[] args) {
        Library library = new Library(5);

        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");

        library.addBook(book1);
        library.addBook(book2);

        library.borrowBook("The Great Gatsby");
        library.borrowBook("The Great Gatsby"); // Attempting to borrow again

        library.returnBook("To Kill a Mockingbird");
        library.returnBook("The Catcher in the Rye"); // Attempting to return a book not in the library
    }
}


/* This example involves the following core Java concepts:

Classes and Objects: We create ConceptualProblems.Book and ConceptualProblems.Library classes to represent books and the library system.
Constructors: The ConceptualProblems.Book class has a constructor to initialize book details.
Encapsulation: Private fields in the ConceptualProblems.Book class with getter methods ensure data encapsulation.
Methods: The borrow() and returnBook() methods in the ConceptualProblems.Book class simulate book borrowing and returning actions.
Arrays: The ConceptualProblems.Library class uses an array of ConceptualProblems.Book objects to manage books.
Looping: Loops are used to search for available slots in the library and to search for a specific book.
Conditionals: Conditional statements are used to check if a book is already borrowed or if the library is full.
Composition: The ConceptualProblems.Library class contains an array of ConceptualProblems.Book objects, demonstrating composition.
ConceptualProblems.Main Method: The LibrarySystem class contains the main method to demonstrate the library system interactions.
This example showcases how various core Java concepts come together to create a more complex program. */