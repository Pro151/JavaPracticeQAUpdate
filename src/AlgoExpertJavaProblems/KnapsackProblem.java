package AlgoExpertJavaProblems;

public class KnapsackProblem {
    public static int knapsack(int[] weights, int[] values, int capacity) {
        int n = weights.length;
        int[][] dp = new int[n + 1][capacity + 1];

        for (int i = 1; i <= n; i++) {
            for (int w = 1; w <= capacity; w++) {
                if (weights[i - 1] <= w) {
                    dp[i][w] = Math.max(values[i - 1] + dp[i - 1][w - weights[i - 1]], dp[i - 1][w]);
                } else {
                    dp[i][w] = dp[i - 1][w];
                }
            }
        }

        return dp[n][capacity];
    }

    public static void main(String[] args) {
        int[] weights = {2, 3, 4, 5};
        int[] values = {3, 4, 5, 6};
        int capacity = 5;
        int result = knapsack(weights, values, capacity);
        System.out.println("Maximum Value in Knapsack: " + result);
    }
}

/* **Problem 2: Knapsack Problem**
Given weights and values of items, find the maximum value that can be obtained by selecting a subset of the
items within a weight limit.


**Explanation:** This program uses dynamic programming to solve the 0/1 Knapsack Problem. It constructs a 2D
array `dp` where `dp[i][w]` represents the maximum value that can be obtained using the first `i`
items and a knapsack of capacity `w`. The solution iterates through the items and capacity,
updating the `dp` array based on the choices of including or excluding the current item.

These are just a couple of examples of complex algorithmic problems. Each problem involves a well-defined
approach and a dynamic programming solution. You can experiment with different inputs and test these solutions
to understand how they work and adapt them to other similar problems. */