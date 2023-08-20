package ConceptualProblems;

import java.util.ArrayList;

public class StreRetriveArrayList {
    public static void main(String[] args) {
        // Create an ArrayList to store integers
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add elements to the ArrayList
        numbers.add(10);
        numbers.add(25);
        numbers.add(7);
        numbers.add(15);

        // Print the ArrayList
        System.out.println("ArrayList: " + numbers);

        // Access elements using get() method
        int firstNumber = numbers.get(0);
        System.out.println("First number: " + firstNumber);

        // Modify an element using set() method
        numbers.set(2, 100);
        System.out.println("Updated ArrayList: " + numbers);

        // Remove an element using remove() method
        numbers.remove(1);
        System.out.println("ArrayList after removal: " + numbers);

        // Check if an element exists using contains() method
        boolean containsSeven = numbers.contains(7);
        System.out.println("Contains 7? " + containsSeven);

        // Get the size of the ArrayList using size() method
        int size = numbers.size();
        System.out.println("Size of ArrayList: " + size);
    }
}

/* In this example:

We import the ArrayList class from the java.util package.
We create an ArrayList named numbers to store integers.
We use the add() method to add elements to the ArrayList.
We use the get() method to access an element at a specific index.
We use the set() method to update an element at a specific index.
We use the remove() method to remove an element at a specific index.
We use the contains() method to check if an element exists in the ArrayList.
We use the size() method to get the size of the ArrayList.
This example demonstrates the basic operations of adding, accessing, updating, removing,
and checking elements in an ArrayList.
 Collections provide dynamic storage and are versatile for managing groups of items in Java. */