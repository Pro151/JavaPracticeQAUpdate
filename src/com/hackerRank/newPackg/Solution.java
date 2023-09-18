import java.util.Scanner;

public class Solution {
    static {
        Scanner scanner = new Scanner(System.in);
        int breadth = scanner.nextInt();
        int height = scanner.nextInt();
        scanner.close();

        if (breadth <= 0 || height <= 0) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        } else {
            int area = breadth * height;
            System.out.println(area);
        }
    }

    public static void main(String[] args) {
        // This main method is provided, but the logic is in the static block above.
    }
}
