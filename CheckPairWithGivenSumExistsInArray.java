package com.arrays;

import java.util.HashMap;

/**
 * This program checks if there exists a pair of elements in the array that sums to a given target.
 *
 * Idea:
 * 1. Traverse the array and for each element calculate its complement (target - current element).
 * 2. Check if the complement already exists in the HashMap:
 *    - If yes, a pair exists , return true.
 *    - If no, add the current element to the HashMap.
 * 3. If no such pair is found after traversal, return false.
 *
 * Time Complexity: O(n) → single pass through array
 * Space Complexity: O(n) → HashMap stores elements
 */
public class CheckPairWithGivenSumExistsInArray {

    public static void main(String[] args) {
        int[] nums = { 8, 4, 1, 7 };
        int target = 10;
        System.err.println("Pair exists or not: " + checkPair(nums, target));
        // Expected Output: true (because 8 + 2 = 10 or 3 + 7 = 10 etc.)
    }

    private static boolean checkPair(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i]; // Find the complement
            if (map.containsKey(complement)) {
                return true; // Pair found
            }
            map.put(nums[i], i); // Store current element
        }

        return false; // No pair found
    }
}
