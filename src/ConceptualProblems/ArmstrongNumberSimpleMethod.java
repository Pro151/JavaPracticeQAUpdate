package ConceptualProblems;

import java.util.Scanner;

public class ArmstrongNumberSimpleMethod {
    public static boolean isArmstrong(int number) {
        int originalNumber = number;
        int numDigits = 0;
        int armstrongSum = 0;

        // Count the number of digits in the number
        while (number > 0) {
            numDigits++;
            number /= 10;
        }

        // Calculate the Armstrong sum
        number = originalNumber; // Reset number to the original value
        while (number > 0) {
            int digit = number % 10;
            armstrongSum += Math.pow(digit, numDigits);
            number /= 10;
        }

        // Check if the Armstrong sum is equal to the original number
        return armstrongSum == originalNumber;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int num= scanner.nextInt();// Change this to the number you want to check

        if (isArmstrong(num)) {
            System.out.println(num + " is an Armstrong number");
        } else {
            System.out.println(num + " is not an Armstrong number");
        }
    }
}

/* Sure, I can explain the algorithm for checking Armstrong numbers in simple language, without providing the actual Java code. Here's how you can do it step by step:

**Algorithm for Checking Armstrong Numbers:**

1. **Input:** Accept an integer input from the user.

2. **Copy Original Number:** Make a copy of the original input number. This is important because we'll modify the number during calculations.

3. **Count Digits:** Count the number of digits in the input number. You can do this by repeatedly dividing the number by 10 and counting the divisions until the number becomes 0.

4. **Calculate Armstrong Sum:** Initialize a variable called `armstrongSum` to 0. Then, for each digit in the original number:
   - Extract the last digit of the number using the remainder operation (%).
   - Raise the extracted digit to the power of the digit count obtained earlier.
   - Add the result to the `armstrongSum`.

5. **Compare Sum with Original Number:** After calculating the `armstrongSum`, compare it with the original input number. If they are equal, then the input number is an Armstrong number.

6. **Output Result:** Display the result to the user, indicating whether the input number is an Armstrong number or not.

That's the basic algorithm for checking Armstrong numbers. You can use this algorithm to build the corresponding Java program or implement it in any other programming language. The key steps involve counting digits, calculating the sum of powered digits,
and comparing the sum with the original number. */
