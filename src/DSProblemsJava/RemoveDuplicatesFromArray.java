package DSProblemsJava;

import java.util.HashSet;
import java.util.ArrayList;

public class RemoveDuplicatesFromArray {
    public static int[] removeDuplicates(int[] nums) {
        HashSet<Integer> uniqueSet = new HashSet<>();
        ArrayList<Integer> resultList = new ArrayList<>();

        for (int num : nums) {
            if (uniqueSet.add(num)) {
                resultList.add(num);
            }
        }

        int[] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = { 3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5 };

        int[] uniqueArray = removeDuplicates(nums);

        System.out.print("Original Array: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }

        System.out.print("\nUnique Array: ");
        for (int num : uniqueArray) {
            System.out.print(num + " ");
        }
    }
}

/* Problem: Remove Duplicates from an Array
Given an array of integers, write a Java program to remove duplicate elements and return
a new array containing only the unique elements,
while maintaining the original order of appearance.

Explanation:

We use a HashSet to keep track of unique elements.
We iterate through the input array, adding each element to the HashSet.
If an element is added successfully (i.e., it's unique), we also add it to the resultList.
Finally, we convert the resultList to an array and return it.
This solution ensures that the order of unique elements in the original array is preserved, while duplicates are removed.

*/
