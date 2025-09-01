package com.arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * This program counts the number of occurrences of each element in an integer array.
 *
 * Idea:
 * 1. Use a HashMap to store each unique element as key and its count as value.
 * 2. Traverse the array:
 *    - If the element is already in the map, increment its count.
 *    - If not, add it to the map with count 1.
 * 3. Return the map containing counts of all elements.
 */
public class CountNumberofOccurences {

    public static void main(String[] args) {
        int arr[] = { 9, 8, 4, 9, 5, 4, 9, 1 };

        // Get the count of each element
        Map<Integer, Integer> countMap = countNumberofOccurences(arr);

        // Print the counts
        System.err.println("Number of Occurrences: " + countMap);
        // Example Output: {1=1, 4=2, 5=1, 8=1, 9=3}
    }

    private static Map<Integer, Integer> countNumberofOccurences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();

        // Loop through each element of the array
        for (int num : arr) {
            // Increment count if present, otherwise initialize to 1
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        return map;
    }
}
