package AlgoExpertJavaProblems;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedCharacter {
    public static char findFirstNonRepeatedCharacter(String str) {
        // Create a LinkedHashMap to maintain order of characters
        Map<Character, Integer> charFrequency = new LinkedHashMap<>();

        // Count frequency of characters in the string
        for (char c : str.toCharArray()) {
            charFrequency.put(c, charFrequency.getOrDefault(c, 0) + 1);
        }

        // Find the first non-repeated character
        for (Map.Entry<Character, Integer> entry : charFrequency.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        // Return a default character if no non-repeated character is found
        return '-';
    }

    public static void main(String[] args) {
        String input = "programming";
        char result = findFirstNonRepeatedCharacter(input);
        if (result != '-') {
            System.out.println("First non-repeated character: " + result);
        } else {
            System.out.println("No non-repeated character found.");
        }
    }
}

/* Sure! Here's a complex algorithmic problem involving data structures, along with a Java code example and explanations for each part of the program:

**Problem: Find the First Non-Repeated Character in a String**

Given a string, find the first non-repeated character in it. If there is no such character, return a suitable message.

**Explanation:**

1. **Creating a LinkedHashMap:** We use a `LinkedHashMap` to maintain the order of characters as they appear in the string.

2. **Counting Frequency:** We iterate through each character in the string and update its frequency count in the `charFrequency` map.

3. **Finding First Non-Repeated Character:** After counting the frequency, we iterate through the map's entries to find the first character with a frequency of 1. This indicates a non-repeated character.

4. **Handling No Non-Repeated Character:** If no non-repeated character is found, we return a default character (in this case, `'-'`) to indicate that no such character exists.

To use this program:
1. Compile the program using `javac FirstNonRepeatedCharacter.java`.
2. Run the program using `java FirstNonRepeatedCharacter`.
3. The program will analyze the input string and display the first non-repeated character or a message if none is found.

This example demonstrates how to solve a complex algorithmic problem involving data structures, specifically using a LinkedHashMap to maintain the order of characters and their frequencies.*/