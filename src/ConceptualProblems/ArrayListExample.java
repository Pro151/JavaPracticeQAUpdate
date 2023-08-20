package ConceptualProblems;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Create an ArrayList to store names
        ArrayList<String> namesList = new ArrayList<>();

        // Adding names to the ArrayList
        namesList.add("Alice");
        namesList.add("Bob");
        namesList.add("Charlie");
        namesList.add("David");

        // Displaying the names in the ArrayList
        System.out.println("Names in the list:");
        for (String name : namesList) {
            System.out.println(name);
        }
    }
}
