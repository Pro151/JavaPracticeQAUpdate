package AlgoExpertJavaProblems;

public class LongestCommonSubsequence {
    public static void main(String[] args) {
        String str1 = "AGGTAB";
        String str2 = "GXTXAYB";

        int[][] dp = new int[str1.length() + 1][str2.length() + 1];

        for (int i = 1; i <= str1.length(); i++) {
            for (int j = 1; j <= str2.length(); j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        int lcsLength = dp[str1.length()][str2.length()];
        System.out.println("Length of Longest Common Subsequence: " + lcsLength);
    }
}

/* 1. Longest Common Subsequence (LCS):

The Longest Common Subsequence problem involves finding the longest sequence that is
 present in two given sequences, in the same relative order.*/