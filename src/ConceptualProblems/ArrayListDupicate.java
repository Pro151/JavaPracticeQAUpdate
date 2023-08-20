package ConceptualProblems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArrayListDupicate {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(15);
        numbers.add(5);
        numbers.add(20);
        numbers.add(10);

        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : numbers) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        System.out.println("Duplicate elements:");
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey());
            }
        }
    }
}


/*
In this example:

We create an ArrayList named numbers containing integers.
We create a HashMap named frequencyMap to store the frequency of each element.
We iterate through the numbers list and update the frequencyMap.
For each element, we use the getOrDefault() method to update the frequency count.
After calculating the frequencies, we iterate through the frequencyMap to find duplicate elements.
Duplicate elements are those with a frequency greater than 1.
This example demonstrates how to use the ArrayList class to store a collection of items and how to
utilize the HashMap class to efficiently find duplicate elements in the collection.*/