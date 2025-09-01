package com.arrays;

import java.util.HashSet;
import java.util.Set;

/**
 * This program checks whether one array is a subset of another array.
 *
 * Idea:
 * 1. Convert the first array (arr1) into a HashSet to allow O(1) lookups.
 * 2. Traverse the second array (arr):
 *    - If any element is not present in the HashSet, return false.
 * 3. If all elements are found, return true (arr is a subset of arr1).
 */
public class FindArrayisSubset {

    public static void main(String[] args) {
        int arr1[] = { 5, 6, 8, 9, 2, 3 };

        int arr2[] = { 8, 9, 2 }; // This array is a subset of arr1, should return true
        int arr3[] = { 8, 9, 1 }; // This array is NOT a subset of arr1, should return false

        System.err.println("Is array subset: " + checkSubsetOrNot(arr1, arr2));
        System.err.println("Is array subset: " + checkSubsetOrNot(arr1, arr3));
    }

    private static boolean checkSubsetOrNot(int[] arr1, int[] arr) {
        // Create a HashSet from arr1 for fast lookups
        Set<Integer> hashSet = new HashSet<>();
        for (int num : arr1) {
            hashSet.add(num);
        }

        // Check each element in arr
        for (int num : arr) {
            if (!hashSet.contains(num)) {
                // If any element is missing in arr1, arr is not a subset
                return false;
            }
        }

        // All elements found, arr is a subset
        return true;
    }
}
