public class StringReverse {
    public static void main(String[] args) {
        // Input string
        String input = "Hello, World!";

        // Call the reverseString method
        String reversed = reverseString(input);

        // Print the reversed string
        System.out.println("Reversed string: " + reversed);
    }

    public static String reverseString(String input) {
        // Convert the string to a character array
        char[] charArray = input.toCharArray();

        // Initialize two pointers
        int left = 0;
        int right = charArray.length - 1;

        // Reverse the characters in the array
        while (left < right) {
            // Swap the characters at the left and right pointers
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;

            // Move the pointers towards each other
            left++;
            right--;
        }

        // Convert the character array back to a string
        return new String(charArray);
    }
}
