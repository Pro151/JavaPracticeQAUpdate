package ConceptualProblems;

public class Factorial {
    public static void main(String[] args) {
        int n = 8;
        int factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        System.out.println("ConceptualProblems.Factorial of " + n + " is " + factorial);
    }
}


/* Certainly! Here's the logic and step-by-step instructions for writing a factorial program in Java:

**Factorial Logic:**

The factorial of a non-negative integer n, denoted as n!, is the product of all positive integers from 1 to n.

For example, 5! = 5 × 4 × 3 × 2 × 1 = 120.

**Instructions:**

1. **Input:** Accept a non-negative integer (n) from the user. Ensure that the input is non-negative, as the factorial is not defined for negative numbers.

2. **Calculate Factorial:**
   - Initialize a variable `factorial` to 1. This is the starting point for calculating the factorial.
   - Use a loop to iterate from 1 to n.
   - For each iteration, multiply the current value of `factorial` by the loop index. Update the `factorial` value accordingly.

3. **Output:** Display the calculated factorial of the input number.

Here's the corresponding Java code with comments explaining each step:

```java
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            int factorial = 1;

            // Calculate factorial using a loop
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }

            System.out.println("Factorial of " + n + " is: " + factorial);
        }
    }
}
```

**Execution Steps:**

1. Run the program.
2. Enter a non-negative integer when prompted.
3. The program will calculate and display the factorial of the input number.

Remember to handle the case when the input is negative, as factorial is not defined for negative numbers.
The program uses a loop to calculate the factorial by iteratively multiplying the values from 1 to n. */