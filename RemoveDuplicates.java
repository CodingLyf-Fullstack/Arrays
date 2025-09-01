package com.arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * This program removes duplicates from a **sorted array** in-place.
 *
 * Idea:
 * 1. Keep a pointer `uniqueIndex` to track the last unique element.
 * 2. Traverse the array from left to right:
 *      - If the current element is different from arr[uniqueIndex], increment `uniqueIndex` and update arr[uniqueIndex].
 * 3. After traversal, elements from 0 to `uniqueIndex` are unique.
 * 4. Convert the unique portion to a new array.
 *
 * Note: Works only for sorted arrays.
 */
public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] arr = {1, 1, 2}; // Sorted input array

        int uniqueIndex = 0; // Index to track last unique element
        int i = 1;

        while (i < arr.length) {
            if (arr[i] != arr[uniqueIndex]) {
                uniqueIndex++;       // Move to next unique position
                arr[uniqueIndex] = arr[i]; // Update unique element
            }
            i++;
        }

        // Create a new array containing only unique elements
        int[] arrayWithoutDuplicates = IntStream.range(0, uniqueIndex + 1)
                .map(index -> arr[index])
                .toArray();

        System.err.println(Arrays.toString(arrayWithoutDuplicates)); // Output: [1, 2]
    }
}
