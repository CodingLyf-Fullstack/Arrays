package com.arrays;

import java.util.*;

/**
 * This program finds the length of the longest consecutive sequence in an array.
 *
 * Idea:
 * 1. Add all elements to a HashSet for O(1) lookups.
 * 2. Iterate through the array, and for each number:
 *      - Check if it is the **start of a sequence** (i.e., num - 1 is not in the set).
 *      - If yes, keep incrementing to find the length of the consecutive sequence.
 * 3. Track the maximum sequence length.
 *
 */
public class LongestConsecutiveSequence {

    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
        System.out.println("Longest Consecutive Sequence Length: " + longestConsecutive(nums));
        // Expected Output: 4 (sequence: 1,2,3,4)
    }

    private static int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int longestStreak = 0;
        for (int num : set) {
            // Only start counting if 'num' is the start of a sequence
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }

                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak;
    }
}
