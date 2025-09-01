package com.arrays;

import java.util.Arrays;

/**
 * This program checks if there exists a triplet in the array whose sum is zero.
 *
 * Idea:
 * 1. Sort the array.
 * 2. Fix one element (arr[i]) and use two pointers (left and right) to find a pair such that:
 *      arr[i] + arr[left] + arr[right] == 0
 * 3. If the sum is less than 0, move left pointer to right (increase sum)
 *    If the sum is greater than 0, move right pointer to left (decrease sum)
 * 4. Stop when pointers meet or triplet is found.
 *
 */
public class TripletWithSumZero {

    public static void main(String[] args) {
        int[] arr = { -1, 0, 1, 2, -1, -4 };
        if (!checkTriplets(arr)) {
            System.out.println("No triplet found");
        }
    }

    private static boolean checkTriplets(int[] arr) {
        int n = arr.length;

        // Step 1: Sort the array
        Arrays.sort(arr);

        // Step 2: Fix one element and find a pair with sum = -arr[i]
        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];

                if (sum == 0) {
                    System.out.println("Triplet found: " + arr[i] + ", " + arr[left] + ", " + arr[right]);
                    return true;
                } else if (sum < 0) {
                    left++;  // Increase sum
                } else {
                    right--; // Decrease sum
                }
            }
        }
        return false; // No triplet found
    }
}
