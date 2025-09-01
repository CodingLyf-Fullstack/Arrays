package com.arrays;

import java.util.Arrays;

/**
 * This program moves all zeros in an array to the left **in-place**
 * while maintaining the relative order of non-zero elements.
 *
 * Idea:
 * 1. Start from the right end of the array.
 * 2. Move all non-zero elements to the end of the array (from right to left).
 * 3. Fill the remaining positions at the start with zeros.
 *
 * Example:
 * Input:  [1, 0, 2, 0, 0, 3, 4]
 * Output: [0, 0, 0, 1, 2, 3, 4]
 */
public class MoveZerosToLeftUsingTwoPointer {

    public static void moveZerosToLeft(int[] arr) {
        int n = arr.length;
        int right = n - 1; // Position to place the next non-zero element

        // Traverse from right to left
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] != 0) {
                arr[right] = arr[i]; // Move non-zero to the 'right' position
                right--;
            }
        }

        // Fill remaining positions with zeros
        while (right >= 0) {
            arr[right] = 0;
            right--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 0, 0, 3, 4};
        moveZerosToLeft(arr);
        System.out.println(Arrays.toString(arr)); // Output: [0, 0, 0, 1, 2, 3, 4]
    }
}
