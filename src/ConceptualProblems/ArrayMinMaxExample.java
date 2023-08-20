package ConceptualProblems;

public class ArrayMinMaxExample {
    public static void main(String[] args) {
        int[] numbers = { 23, 8, 45, 12, 6, 78, 34 };

        int max = numbers[0]; // Assume first element as maximum
        int min = numbers[0]; // Assume first element as minimum

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i]; // Update maximum if a larger element is found
            }
            if (numbers[i] < min) {
                min = numbers[i]; // Update minimum if a smaller element is found
            }
        }

        System.out.println("Maximum element: " + max);
        System.out.println("Minimum element: " + min);
    }
}


/* In this example:

We have an array named numbers containing integers.
We initialize two variables, max and min, with the value of the first element of the array.
We then iterate through the rest of the array using a for loop.
Inside the loop, we compare each element with the current max and min values.
If an element is larger than the current max, we update the max value.
If an element is smaller than the current min, we update the min value.
After iterating through the entire array, we print the maximum and minimum values.
This example demonstrates how to traverse an array, compare elements,
and find the maximum and minimum values within it.
It's a basic example that showcases the concept of working with arrays effectively.
*/