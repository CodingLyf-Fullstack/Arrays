package com.arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * This program prints all subsets of a given array using recursion.
 *
 * Idea:
 * 1. At each index, we have two choices for the current element:
 *      - Include it in the current subset
 *      - Exclude it from the current subset
 * 2. Recursively move to the next index with both choices.
 * 3. When index reaches the end of the array, print the current subset.
 *
 * Example:
 * Input: [1, 2, 3]
 * Output: [1, 2, 3], [1, 2], [1, 3], [1], [2, 3], [2], [3], []
 */
public class SubsetsRecursive {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        List<Integer> current = new ArrayList<>();
        printSubsets(arr, 0, current);
    }

    /**
     * Recursive function to print subsets
     * 
     * @param arr     Input array
     * @param index   Current index in array
     * @param current Current subset being formed
     */
    private static void printSubsets(int[] arr, int index, List<Integer> current) {
        // Base case: reached the end of the array
        if (index == arr.length) {
            System.out.print(current + " , ");
            return;
        }

        // Include the current element in subset
        current.add(arr[index]);
        printSubsets(arr, index + 1, current);

        // Exclude the current element (backtrack)
        current.remove(current.size() - 1);
        printSubsets(arr, index + 1, current);
    }
}
