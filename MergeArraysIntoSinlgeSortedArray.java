package com.arrays;

import java.util.Arrays;

/**
 * This program merges two integer arrays into a single sorted array.
 *
 * Idea:
 * 1. Sort both input arrays individually.
 * 2. Use a merge-like process (like in merge sort) to combine them into a new array.
 * 3. Traverse both arrays simultaneously:
 *    - Pick the smaller element from the current positions of the two arrays.
 *    - Add it to the merged array and move the pointer.
 * 4. After one array is exhausted, copy the remaining elements of the other array.
 */
public class MergeArraysIntoSingleSortedArray {

    public static void main(String[] args) {
        int arr1[] = {2, 3, 5, 4, 1};
        int arr2[] = {8, 7, 6, 10, 9};

        System.err.println("Sorted Array: " + Arrays.toString(mergeArraysInSortedOrder(arr1, arr2)));
    }

    private static int[] mergeArraysInSortedOrder(int[] arr1, int[] arr2) {
        // Sort both arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Correct size of merged array
        int mergedArray[] = new int[arr1.length + arr2.length];

        int i = 0, j = 0, k = 0;

        // Merge arrays until one of them is exhausted
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                mergedArray[k++] = arr1[i++];
            } else {
                mergedArray[k++] = arr2[j++];
            }
        }

        // Copy any remaining elements from arr1
        while (i < arr1.length) {
            mergedArray[k++] = arr1[i++];
        }

        // Copy any remaining elements from arr2
        while (j < arr2.length) {
            mergedArray[k++] = arr2[j++];
        }

        return mergedArray;
    }
}
