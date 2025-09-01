package com.arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * This program finds all duplicate elements in an integer array.
 *
 * Idea:
 * 1. Use a HashSet to track numbers we've seen so far.
 * 2. Use a List to store numbers that are duplicates.
 * 3. Traverse the array:
 *    - Try to add each number to the HashSet.
 *    - If adding fails (number already exists in HashSet), it's a duplicate > add to the List.
 * 4. Print the list of duplicates.
 */
public class FindDuplicatesInArray {

    public static void main(String[] args) {
        int[] arr = { 2, 5, 6, 2, 1, 3, 1, 8, 3 };

        // List to store duplicate numbers
        List<Integer> list = new ArrayList<>();

        // HashSet to keep track of seen numbers
        HashSet<Integer> seen = new HashSet<>();

        // Loop through each number in the array
        for (int num : arr) {
            // If num is already in 'seen', add it to the list of duplicates
            if (!seen.add(num)) {
                list.add(num);
            }
        }

        // Print the duplicates
        System.out.println(list); // Output: [2, 1, 3]
    }
}
