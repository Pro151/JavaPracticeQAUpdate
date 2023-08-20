package ConceptualProblems;

public class ReverseNumber {
    public static void main(String[] args) {
        int num = 12345;
        int reversed = 0;

        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        System.out.println("Reversed number: " + reversed);
    }
}
