package JavaComplexProblem;

import java.util.*;

class Book1 {
    private String title;
    private String author;

    public Book1(String title, String author) {
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
        return "\"" + title + "\" by " + author;
    }
}

class Library {
    private ArrayList<Book1> book1s;

    public Library() {
        book1s = new ArrayList<>();
    }

    public void addBook(Book1 book1) {
        book1s.add(book1);
        System.out.println(book1.getTitle() + " added to the library.");
    }

    public void displayBooks() {
        System.out.println("Books in the library:");
        for (Book1 book1 : book1s) {
            System.out.println(book1);
        }
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Book");
            System.out.println("2. Display Books");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter author name: ");
                    String author = scanner.nextLine();
                    Book1 newBook1 = new Book1(title, author);
                    library.addBook(newBook1);
                    break;
                case 2:
                    library.displayBooks();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}

/* In this example:

We define a Book class with properties like title and author, along with getter methods and a toString() method
for displaying book information.
The Library class manages a collection of Book objects using an ArrayList.
It has methods to add books and display all books in the library.
The LibrarySystem class contains the main program logic.
It provides a menu-driven interface for adding books, displaying books, and exiting the system.
We use a Scanner to take user input for adding books and choosing menu options.
The program keeps running until the user chooses to exit.
This example showcases the usage of classes, objects, collections (ArrayList),
user input, and basic program structure to create a simple library management system. */