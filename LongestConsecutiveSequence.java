package com.arrays;

import java.util.*;

public class LongestConsecutiveSequence {

	public static void main(String[] args) {
		int[] nums = { 100, 4, 200, 1, 3, 2 };
		System.out.println("Longest Consecutive Sequence Length: " + longestConsecutive(nums));
	}

	private static int longestConsecutive(int[] nums) {
		Set<Integer> set = new HashSet<>();
		for (int num : nums) {
			set.add(num);
		}

		int longestStreak = 0;
		for (int num : nums) {

			if (set.contains(num - 1)) {
				int currentNum = num;
				int currentStreak = 1;
				while (set.contains(currentNum)) {
					currentStreak++;
					currentNum++;
				}
				longestStreak = Math.max(longestStreak, currentStreak);
			}
		}

		return longestStreak;
	}
}
