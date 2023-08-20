package AlgoExpertJavaProblems.AmazonGooglePwcProblems;

public class MaximumSubarraySum {
    public static int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currentSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int result = maxSubArray(nums);
        System.out.println("Maximum Subarray Sum: " + result);
    }
}

/* Problem: Maximum Subarray Sum - Amazon, Google, PwC:

Description: Given an array of integers, find the contiguous subarray with the largest sum.
Explanation: This code uses the Kadane's algorithm to find the maximum subarray sum.
It maintains two variables, currentSum and maxSum, where currentSum represents the maximum sum ending at
 the current index. The algorithm iterates through the array,
updating these variables based on the current element and the maximum sum found so far.

*/