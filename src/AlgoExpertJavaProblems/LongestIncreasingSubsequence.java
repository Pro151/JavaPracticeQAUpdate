package AlgoExpertJavaProblems;

public class LongestIncreasingSubsequence {
    public static int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        int maxLength = 1;

        for (int i = 0; i < n; i++) {
            dp[i] = 1; // Initialize to 1 as a subsequence of length 1 is valid
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                    maxLength = Math.max(maxLength, dp[i]);
                }
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        int[] nums = {10, 22, 9, 33, 21, 50, 41, 60, 80};
        int result = lengthOfLIS(nums);
        System.out.println("Length of Longest Increasing Subsequence: " + result);
    }
}

/* Certainly! I can provide you with some complex algorithmic problems along with code examples and explanations.
Let's start with a few well-known algorithmic problems:

**Problem 1: Longest Increasing Subsequence**
Given an array of integers, find the length of the longest increasing subsequence.


**Explanation:** This program uses dynamic programming to find the length of the longest increasing subsequence in an array of integers. It uses an array `dp` to store the length of the longest increasing subsequence that ends at each index. The solution iterates through the array and updates the `dp` array based on the values in the array. The result is the maximum value in the `dp` array.

*/
