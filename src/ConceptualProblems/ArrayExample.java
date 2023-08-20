package ConceptualProblems;

public class ArrayExample {
    public static void main(String[] args) {
        int[] numbers = { 42, 15, 7, 32, 18, 9, 28 };

        // Finding the maximum and minimum elements in the array
        int max = numbers[0]; // Initialize max with the first element
        int min = numbers[0]; // Initialize min with the first element

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        System.out.println("Maximum element: " + max);
        System.out.println("Minimum element: " + min);
    }
}
