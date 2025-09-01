package com.arrays;

import java.util.Arrays;

/**
 * This program rotates an array to the right by k steps using the reversal algorithm.
 *
 * Idea:
 * 1. Reverse the entire array.
 * 2. Reverse the first k elements.
 * 3. Reverse the remaining n-k elements.
 *
 * Example:
 * arr = [1,2,3,4,5,6,7], k = 3
 * Step 1: Reverse entire array  [7,6,5,4,3,2,1]
 * Step 2: Reverse first k elements  [5,6,7,4,3,2,1]
 * Step 3: Reverse remaining n-k elements →[5,6,7,1,2,3,4]
 */
public class RotateArraybyKSteps {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 3;
        int n = arr.length;

        // Step 1: Reverse the entire array
        reverse(arr, 0, n - 1);
        System.out.println("Reverse entire array: " + Arrays.toString(arr));

        // Step 2: Reverse the first k elements
        reverse(arr, 0, k - 1);
        System.out.println("Reverse first k elements: " + Arrays.toString(arr));

        // Step 3: Reverse the remaining n-k elements
        reverse(arr, k, n - 1);
        System.out.println("Final rotated array: " + Arrays.toString(arr));
    }

    // Utility method to reverse elements between start and end indices
    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
