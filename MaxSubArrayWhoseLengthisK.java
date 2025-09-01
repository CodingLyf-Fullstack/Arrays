package com.arrays;

/**
 * This program finds the maximum sum of a contiguous subarray of length k.
 *
 * Idea:
 * 1. Use the sliding window technique to compute sums efficiently.
 * 2. Compute the sum of the first 'k' elements.This is the initial window sum.
 * 3. Slide the window one element at a time:
 *    - Add the next element entering the window.
 *    - Subtract the element leaving the window.
 *    - Update maxSum if current window sum is greater.
 */
public class MaxSubArrayWhoseLengthisK {

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;

        // Compute sum of first 'k' elements
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        // Initialize maxSum as the sum of the first window
        int maxSum = sum;

        // Slide the window
        for (int i = k; i < arr.length; i++) {
            sum += arr[i];        // Add new element entering the window
            sum -= arr[i - k];    // Remove element leaving the window
            maxSum = Math.max(maxSum, sum); // Update maxSum
        }

        System.err.println("Maximum sum of subarray of length " + k + ": " + maxSum);
        // Expected Output: 9 and subarray [5, 1, 3]
    }
}
