import java.util.HashMap;
import java.util.Map;

public class FindDuplicateCharacters {
    public static void main(String[] args) {
        String input = "programming";

        // Create a HashMap to store characters and their counts
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Convert the string to an array of characters
        char[] charArray = input.toCharArray();

        // Iterate through the characters in the array
        for (char ch : charArray) {
            // If the character is already in the map, increment its count
            if (charCountMap.containsKey(ch)) {
                charCountMap.put(ch, charCountMap.get(ch) + 1);
            } else {
                // Otherwise, add it to the map with a count of 1
                charCountMap.put(ch, 1);
            }
        }

        // Print duplicate characters
        System.out.println("Duplicate characters in the string:");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " - " + entry.getValue() + " times");
            }
        }
    }
}
