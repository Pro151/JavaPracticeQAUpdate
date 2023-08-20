package ConceptualProblems;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // Convert the number to a string
        String numStr = Integer.toString(num);

        // Calculate the number of digits in the number
        int numDigits = numStr.length();

        // Initialize the Armstrong sum
        int armstrongSum = 0;

        // Iterate through each digit of the number
        for (int i = 0; i < numDigits; i++) {
            int digit = Character.getNumericValue(numStr.charAt(i));
            // Raise the digit to the power of the number of digits and add to the sum
            armstrongSum += Math.pow(digit, numDigits);
        }

        // Check if the calculated sum is equal to the original number
        if (armstrongSum == num) {
            System.out.println(num + " is an Armstrong number");
        } else {
            System.out.println(num + " is not an Armstrong number");
        }
    }
}


/*  Sure, I can provide you with a step-by-step explanation of the Armstrong number logic in words for Java:

1. **Input:** Accept an integer input from the user.

2. **Convert to String:** Convert the input number to a string to easily access its digits.

3. **Calculate Number of Digits:** Find the number of digits in the input number by using the length of the string representation.

4. **Calculate Armstrong Sum:** Initialize a variable `armstrongSum` to 0. Iterate through each digit of the input number using a loop. For each digit:
   - Convert the digit character back to an integer.
   - Raise the digit to the power of the number of digits.
   - Add the result to the `armstrongSum`.

5. **Check for Armstrong Condition:** After iterating through all digits, compare the calculated `armstrongSum` with the original input number. If they are equal, then the input number is an Armstrong number. Otherwise, it's not.

6. **Output Result:** Display the result to the user, indicating whether the input number is an Armstrong number or not.

Here's the corresponding Java code with comments explaining each step:

```java
import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // Convert the number to a string
        String numStr = Integer.toString(num);

        // Calculate the number of digits in the number
        int numDigits = numStr.length();

        // Initialize the Armstrong sum
        int armstrongSum = 0;

        // Iterate through each digit of the number
        for (int i = 0; i < numDigits; i++) {
            int digit = Character.getNumericValue(numStr.charAt(i));
            // Raise the digit to the power of the number of digits and add to the sum
            armstrongSum += Math.pow(digit, numDigits);
        }

        // Check if the calculated sum is equal to the original number
        if (armstrongSum == num) {
            System.out.println(num + " is an Armstrong number");
        } else {
            System.out.println(num + " is not an Armstrong number");
        }
    }
}
```

This Java code follows the logic steps described above to determine whether a given number is an Armstrong number or not.
Certainly! Here are a few examples of Armstrong numbers:

1. **153:**
   - Number of Digits: 3
   - 1^3 + 5^3 + 3^3 = 153

2. **370:**
   - Number of Digits: 3
   - 3^3 + 7^3 + 0^3 = 370

3. **371:**
   - Number of Digits: 3
   - 3^3 + 7^3 + 1^3 = 371

4. **407:**
   - Number of Digits: 3
   - 4^3 + 0^3 + 7^3 = 407

5. **1634:**
   - Number of Digits: 4
   - 1^4 + 6^4 + 3^4 + 4^4 = 1634

6. **8208:**
   - Number of Digits: 4
   - 8^4 + 2^4 + 0^4 + 8^4 = 8208

7. **9474:**
   - Number of Digits: 4
   - 9^4 + 4^4 + 7^4 + 4^4 = 9474

These numbers meet the Armstrong number criteria: the sum of each digit raised to the power of the number of digits equals the original number itself. You can use these examples to test your Armstrong number code implementation.

*/