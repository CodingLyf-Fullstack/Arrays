package com.arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * This program finds a continuous subarray in an integer array whose sum equals a given target.
 *
 * Idea:
 * 1. Use the sliding window approach with two pointers: start and end.
 * 2. Expand the window by moving 'end' and adding arr[end] to currentSum.
 * 3. If currentSum exceeds target, shrink the window by moving 'start' and subtracting arr[start].
 * 4. Repeat until currentSum equals the target or 'end' reaches the array's end.
 * 5. Return or print the subarray between 'start' and 'end'.
 *
 * Note: This works efficiently for arrays with non-negative numbers.
 */
public class FindSubArrayWithGivenSum {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 7, 5};
        int target = 12;

        findSubArrayWithGivenSum(arr, target);
    }

    private static void findSubArrayWithGivenSum(int[] arr, int targetSum) {
        int start = 0, end = 0, currentSum = 0;

        // Slide the window from left to right
        while (end < arr.length) {
            currentSum += arr[end]; // Expand window by including arr[end]

            // Shrink window from the left if sum exceeds target
            while (currentSum > targetSum && start < end) {
                currentSum -= arr[start];
                start++;
            }

            // If current window sum equals target, stop
            if (currentSum == targetSum) {
                break;
            }

            end++;
        }

        // Print indexes of subarray
        System.err.println("Indexes of subarray; start: " + start + " end: " + end);

        // Extract the subarray using IntStream
        int[] subArray = IntStream.range(start, end + 1).map(i -> arr[i]).toArray();
        System.out.println("Subarray: " + Arrays.toString(subArray));
    }
}
