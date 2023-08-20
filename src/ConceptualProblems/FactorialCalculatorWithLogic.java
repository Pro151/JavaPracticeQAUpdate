package ConceptualProblems;

import java.util.Scanner;

public class FactorialCalculatorWithLogic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Accept a positive integer from the user
        System.out.print("Enter a positive integer: ");
        int num = scanner.nextInt();

        // Initialize factorial to 1
        long factorial = 1;

        // Calculate factorial using a loop
        for (int i = 1; i <= num; i++) {
            factorial *= i; // Multiply current factorial by the loop variable
        }

        // Output: Display the factorial
        System.out.println("Factorial of " + num + " is " + factorial);
    }
}


/* Certainly! Here's a Java program to calculate the factorial of a given number, along with explanations for each part of the program:


**Explanation:**

1. **Import Statement:** We import the `java.util.Scanner` class to enable user input.

2. **Main Method:** This is the entry point of the program.

3. **User Input:** We create a `Scanner` object to read user input. We prompt the user to enter a positive integer.

4. **Initializing Variables:** We declare a `long` variable `factorial` and initialize it to 1. The use of `long` allows us to handle larger factorials without running into integer overflow issues.

5. **Factorial Calculation:** We use a `for` loop to calculate the factorial of the given number. The loop runs from 1 to the input number (`num`), and in each iteration, we multiply the current `factorial` value by the loop variable (`i`).

6. **Output Display:** Finally, we display the calculated factorial to the user.

To use this program, you can follow these steps:
1. Compile the program using `javac FactorialCalculator.java`.
2. Run the program using `java FactorialCalculator`.
3. Enter a positive integer when prompted, and the program will calculate and display the factorial.

Keep in mind that the program assumes the user will provide a positive integer. You can add input validation to ensure that the user enters a valid positive integer.*/