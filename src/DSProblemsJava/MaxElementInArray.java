package DSProblemsJava;

public class MaxElementInArray {
    public static int findMaxElement(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array is empty.");
        }

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] numbers = { 10, 5, 20, 15, 25 };
        int maxElement = findMaxElement(numbers);
        System.out.println("Maximum element in the array: " + maxElement);
    }
}


/* Problem: Finding the Maximum Element in an Array
You are given an array of integers. Write a Java program to find the maximum element in the array.

In this solution:

The findMaxElement method takes an array of integers as input and returns the maximum element in the array.
We initialize max with the first element of the array.
We iterate through the array, comparing each element with the current max.
If an element is greater than the current max, we update max.
The main method creates an array of numbers and calls the findMaxElement method to find the maximum element,
then prints the result.
This problem demonstrates how to use a loop to traverse an array and keep track of the maximum element encountered.



*/
