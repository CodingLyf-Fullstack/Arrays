package com.arrays;

import java.util.Arrays;

/**
 * This program moves all zeros in an array to the end while maintaining the order of non-zero elements.
 *
 * Idea:
 * 1. Create a new array of the same length.
 * 2. Traverse the original array:
 *    - Copy all non-zero elements to the new array.
 *    - Keep a count of zeros encountered.
 * 3. After copying all non-zero elements, fill the remaining positions in the new array with zeros.
 */
public class MoveAllZerostoEnd {

    public static void main(String[] args) {
        int[] arr = { 0, 2, 3, 0, 0, 1, 4, 0, 0 };

        System.err.println("Output: " + Arrays.toString(moveAllZerosToEnd(arr)));
        // Expected Output: [2, 3, 1, 4, 0, 0, 0, 0, 0]
    }

    private static int[] moveAllZerosToEnd(int[] arr) {
        int[] result = new int[arr.length]; // New array to store result

        int i = 0;      // Pointer for result array
        int zeroCount = 0; // Count of zeros in the original array

        // Copy non-zero elements to the new array
        for (int num : arr) {
            if (num == 0) {
                zeroCount++; // Count zeros
            } else {
                result[i] = num; // Copy non-zero
                i++;
            }
        }

        // Fill the remaining positions with zeros
        while (zeroCount > 0) {
            result[i] = 0;
            i++;
            zeroCount--;
        }

        return result;
    }
}
