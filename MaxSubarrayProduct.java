package com.arrays;

/**
 * This program finds the maximum product of a contiguous subarray.
 *
 * Idea:
 * 1. Track both the maximum and minimum product ending at the current position.
 *    - maxEnd: maximum product ending at current index
 *    - minEnd: minimum product ending at current index
 * 2. If the current number is negative, swap maxEnd and minEnd.
 *    - A negative number can turn a large negative product into a large positive product.
 * 3. Update maxProduct with maxEnd at each step.
 */
public class MaxSubarrayProduct {

    public static void main(String[] args) {
        int[] arr = { 2, 3, -2, 4 };
        System.err.println("Max Product of Subarray: " + findMaxProductOfSubarray(arr));
        // Expected Output: 6 -> subarray [2,3]

        int[] arr1 = { 1, -2, -3, 4, -1, 2, 1 };
        System.err.println("Max Product of Subarray: " + findMaxProductOfSubarray(arr1));
        // Expected Output: 24 -> subarray [-2, -3, 4, -1, 2, 1]
    }

    private static int findMaxProductOfSubarray(int[] arr) {
        int maxProduct = arr[0];
        int maxEnd = arr[0];
        int minEnd = arr[0];

        for (int i = 1; i < arr.length; i++) {
            int num = arr[i];

            // If current number is negative, swap max and min
            if (num < 0) {
                int temp = maxEnd;
                maxEnd = minEnd;
                minEnd = temp;
            }

            // Update max and min products ending at current index
            maxEnd = Math.max(num, num * maxEnd);
            minEnd = Math.min(num, num * minEnd);

            // Update overall max product
            maxProduct = Math.max(maxProduct, maxEnd);
        }

        return maxProduct;
    }
}
