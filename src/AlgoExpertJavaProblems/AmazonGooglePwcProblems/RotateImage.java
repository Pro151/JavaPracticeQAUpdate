package AlgoExpertJavaProblems.AmazonGooglePwcProblems;

import java.util.Arrays;

public class RotateImage {
    public static void rotate(int[][] matrix) {
        int n = matrix.length;

        // Transpose the matrix
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Reverse each row
        for (int i = 0; i < n; i++) {
            int left = 0, right = n - 1;
            while (left < right) {
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        rotate(matrix);
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}
 /* Problem: Rotate Image (Matrix) - Amazon, Google:

Description: Given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).
Explanation: This code rotates the matrix by first transposing it (swapping rows with columns)
and then reversing each row.
The transpose step ensures that the matrix is rotated 90 degrees clockwise.

*/