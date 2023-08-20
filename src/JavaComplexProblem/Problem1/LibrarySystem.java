package JavaComplexProblem.Problem1;

class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return title + " by " + author;
    }
}

class Library {
    private Book[] books;
    private int totalBooks;

    public Library(int capacity) {
        books = new Book[capacity];
        totalBooks = 0;
    }

    public void addBook(Book book) {
        if (totalBooks < books.length) {
            books[totalBooks] = book;
            totalBooks++;
            System.out.println("Book added to the library.");
        } else {
            System.out.println("Library is full. Cannot add more books.");
        }
    }

    public void displayBooks() {
        System.out.println("Books in the library:");
        for (int i = 0; i < totalBooks; i++) {
            System.out.println((i + 1) + ". " + books[i]);
        }
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        Library myLibrary = new Library(5);

        Book book1 = new Book("Java Programming", "John Smith");
        Book book2 = new Book("Introduction to Algorithms", "Thomas Cormen");

        myLibrary.addBook(book1);
        myLibrary.addBook(book2);

        myLibrary.displayBooks();
    }
}
