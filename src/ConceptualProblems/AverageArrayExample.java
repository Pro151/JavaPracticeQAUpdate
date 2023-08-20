package ConceptualProblems;

public class AverageArrayExample {
    public static void main(String[] args) {
        int[] numbers = { 5, 10, 15, 20, 25 };
        int sum = 0;

        for (int num : numbers) {
            sum += num;
        }

        double average = (double) sum / numbers.length;

        System.out.println("Average: " + average);
    }
}
