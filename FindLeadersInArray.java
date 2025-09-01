package com.arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * This program finds all "leaders" in an integer array.
 *
 * Definition:
 * An element is a leader if it is strictly greater than all elements to its right.
 *
 * Idea:
 * 1. Traverse the array from right to left.
 * 2. Keep track of the maximum element seen so far (initially, the last element is a leader).
 * 3. If the current element is greater than the max, it is also a leader.
 * 4. Add all leaders to a list.
 */
public class FindLeadersInArray {

    public static void main(String[] args) {
        int arr[] = {16, 17, 4, 3, 5, 2};

        System.err.println("Leaders: " + getLeaders(arr));
        // Expected Output: [2, 5, 17]
    }

    private static List<Integer> getLeaders(int[] arr) {
        List<Integer> list = new ArrayList<>();

        // Last element is always a leader
        int max = arr[arr.length - 1];
        list.add(max);

        // Traverse from second last element to the first element
        for (int i = arr.length - 2; i >= 0; i--) {  // Fix: i >= 0
            if (arr[i] > max) {
                list.add(arr[i]);
                max = arr[i]; // Update current max
            }
        }

        // Optional: If you want leaders in original order, reverse the list
        // Collections.reverse(list);

        return list;
    }
}
