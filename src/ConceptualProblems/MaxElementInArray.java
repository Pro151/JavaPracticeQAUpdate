package ConceptualProblems;

public class MaxElementInArray {
    public static void main(String[] args) {
        int[] numbers = { 5, 12, 27, 8, 15, 20 };
        int max = numbers[0]; // Assume the first element is the maximum

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i]; // Update max if a larger element is found
            }
        }

        System.out.println("Maximum element: " + max);
    }
}


/* In this example:

We have an array numbers containing integer values.
We initialize a variable max with the first element of the array.
We loop through the array from the second element onwards.
In each iteration, we compare the current element with the max value.
If the current element is greater than the max, we update the max value.
Finally, we print the maximum element after the loop.
This example demonstrates how to use a loop to traverse an array and find the maximum element within it.
You can modify and expand upon this example to practice working with arrays in various ways,
such as finding the minimum element, calculating the sum, or searching for a specific element.*/