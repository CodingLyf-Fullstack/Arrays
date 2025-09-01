package com.arrays;

/**
 * This program counts the number of contiguous subarrays whose sum equals a given target.
 *
 * Idea:
 * 1. Use the sliding window technique with two pointers: start and end.
 * 2. Expand the window by moving 'end' and adding arr[end] to currentSum.
 * 3. Shrink the window from 'start' if currentSum exceeds target.
 * 4. Each time currentSum equals the target, increment the count.
 *
 * Limitation:
 * - This approach works correctly for **arrays with non-negative numbers** only.
 * - For arrays with negative numbers, a prefix-sum + hashmap approach is needed.
 */
public class FindNumberOfSubArraysWithGivenSum {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 3, 1 };
        int target = 5;

        findSubArrayWithGivenSum(arr, target);
        // Expected Output: 2 → subarrays: [2,3] and [2,3] (or [1,2,2])
    }

    private static void findSubArrayWithGivenSum(int[] arr, int targetSum) {
        int start = 0, end = 0, currentSum = 0;
        int count = 0;

        while (end < arr.length) {
            currentSum += arr[end]; // Expand window

            // Shrink window if sum exceeds target
            while (currentSum > targetSum && start < end) {
                currentSum -= arr[start];
                start++;
            }

            // If current window sum equals target, increment count
            if (currentSum == targetSum) {
                count++;
            }

            end++;
        }

        System.out.println("Subarrays count: " + count);
    }
}
