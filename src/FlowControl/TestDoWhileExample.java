package FlowControl;

import java.util.Scanner;

public class TestDoWhileExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;

        do {
            System.out.print("Enter a positive number: ");
            num = scanner.nextInt();
        } while (num <= 0);

        System.out.println("You entered: " + num);
    }
}
