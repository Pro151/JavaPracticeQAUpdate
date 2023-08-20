package ConceptualProblems;

import java.util.Scanner;

public class FibonacciSequenceWithInst {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Accept the number of terms from the user
        System.out.print("Enter the number of Fibonacci terms: ");
        int numTerms = scanner.nextInt();

        // Display initial terms
        System.out.print("Fibonacci Sequence (" + numTerms + " terms): ");

        // Initialize first two terms
        int firstTerm = 0, secondTerm = 1;

        // Loop to calculate and display Fibonacci sequence
        for (int i = 1; i <= numTerms; i++) {
            // Display the current term
            System.out.print(firstTerm + " ");

            // Calculate the next term by adding the previous two terms
            int nextTerm = firstTerm + secondTerm;

            // Update first and second terms for the next iteration
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }

        // Close the scanner
        scanner.close();
    }
}

/* Certainly! Here's a Java program that calculates and displays the Fibonacci sequence up to a specified number of terms, along with explanations for each part of the program:
```

**Explanation:**

1. **Import Statement:** We import the `java.util.Scanner` class for user input.

2. **Main Method:** This is the entry point of the program.

3. **User Input:** We create a `Scanner` object to read user input. We prompt the user to enter the number of Fibonacci terms they want to display.

4. **Initial Display:** We display a message indicating the number of terms.

5. **Initializing Variables:** We initialize `firstTerm` to 0 and `secondTerm` to 1, which are the first two terms of the Fibonacci sequence.

6. **Fibonacci Calculation and Display:** We use a `for` loop to calculate and display the Fibonacci sequence. In each iteration:
   - We display the current value of `firstTerm`.
   - We calculate the next term (`nextTerm`) by adding `firstTerm` and `secondTerm`.
   - We update `firstTerm` and `secondTerm` for the next iteration.

7. **Closing the Scanner:** After the loop, we close the `Scanner` to release system resources.

To use this program:
1. Compile the program using `javac FibonacciSequence.java`.
2. Run the program using `java FibonacciSequence`.
3. Enter the number of terms you want to display in the Fibonacci sequence.

The program will calculate and display the requested number of terms in the Fibonacci sequence.


Math Calc:

Certainly! Let's walk through the Fibonacci series example with some mathematics calculations. The Fibonacci sequence is a series of numbers in which each number is the sum of the two preceding ones, usually starting with 0 and 1. Mathematically, the Fibonacci sequence can be defined as follows:

F(0) = 0
F(1) = 1
F(n) = F(n-1) + F(n-2) for n > 1

Let's calculate the Fibonacci sequence manually for the first few terms using this formula:

1. **Term 0 (F(0)):**
   F(0) = 0

2. **Term 1 (F(1)):**
   F(1) = 1

3. **Term 2 (F(2)):**
   F(2) = F(1) + F(0) = 1 + 0 = 1

4. **Term 3 (F(3)):**
   F(3) = F(2) + F(1) = 1 + 1 = 2

5. **Term 4 (F(4)):**
   F(4) = F(3) + F(2) = 2 + 1 = 3

6. **Term 5 (F(5)):**
   F(5) = F(4) + F(3) = 3 + 2 = 5

7. **Term 6 (F(6)):**
   F(6) = F(5) + F(4) = 5 + 3 = 8

And so on...

So, the Fibonacci sequence starts as: 0, 1, 1, 2, 3, 5, 8, ...

Each term is the sum of the previous two terms. This recursive pattern continues throughout the sequence.

You can easily use this mathematical definition to implement a program to generate the Fibonacci sequence, as shown in the previous example. The formula `F(n) = F(n-1) + F(n-2)`
captures the essence of the Fibonacci sequence's growth.

*/