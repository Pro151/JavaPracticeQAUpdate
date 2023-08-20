package AlgoExpertJavaProblems.AmazonGooglePwcProblems;

import java.util.*;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numToIndex = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numToIndex.containsKey(complement)) {
                return new int[]{numToIndex.get(complement), i};
            }
            numToIndex.put(nums[i], i);
        }
        return null; // No solution found
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(nums, target);
        System.out.println("Indices of Two Sum: " + Arrays.toString(result));
    }
}

/* Problem: Two Sum - Amazon, Google:

Description: Given an array of integers and a target sum,
find two numbers in the array that add up to the target sum and return their indices.

Explanation: This code uses a hash map to store numbers and their indices. As it iterates through the array,
it calculates the complement needed to achieve the target sum.
If the complement is already in the hash map, it means a solution is found.
*/