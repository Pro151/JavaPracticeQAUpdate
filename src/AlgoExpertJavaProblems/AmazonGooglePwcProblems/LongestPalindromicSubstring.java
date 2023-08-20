package AlgoExpertJavaProblems.AmazonGooglePwcProblems;

public class LongestPalindromicSubstring {
    public static String longestPalindrome(String s) {
        if (s == null || s.length() < 2) {
            return s;
        }

        int start = 0;
        int maxLength = 1;

        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);
            int len = Math.max(len1, len2);

            if (len > maxLength) {
                maxLength = len;
                start = i - (len - 1) / 2;
            }
        }

        return s.substring(start, start + maxLength);
    }

    public static int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }

    public static void main(String[] args) {
        String input = "babad";
        String result = longestPalindrome(input);
        System.out.println("Longest Palindromic Substring: " + result);
    }
}

/* Problem: Longest Palindromic Substring - Amazon, Google, PwC:

Description: Given a string, find the longest palindromic substring in it.

Explanation: This code uses the "expand around center" approach to find the longest palindromic substring.
For each character in the string, it expands around the center (single character or between two characters)
to find the maximum palindromic substring length.
The expandAroundCenter function calculates the length of the palindrome centered at a given position.*/