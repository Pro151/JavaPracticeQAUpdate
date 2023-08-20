package ConceptualProblems;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Accept a positive integer from the user
        System.out.print("Enter 1st positive integer: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter 2nd positive integer: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter 2nd positive integer: ");
        int num3 = scanner.nextInt();



        int largest = (num1 > num2) ? ((num1 > num3) ? num1 : num3) : ((num2 > num3) ? num2 : num3);

        System.out.println("Largest number: " + largest);
    }
}
