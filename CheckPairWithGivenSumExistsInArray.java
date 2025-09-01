package com.arrays;

import java.util.HashMap;

public class CheckPairWithGivenSumExistsInArray {

	public static void main(String a[]) {
		int[] nums = { 8, 4, 1, 7 };
		int target = 10;
		System.err.println("Pair exists or not " + checkPair(nums, target));

	}

	private static boolean checkPair(int[] nums, int target) {

		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			// Calculate the complement that would sum to our target
			int complement = target - nums[i];
			// Check if that complement is in our hash table
			if (map.containsKey(complement)) {
				return true;
			}
			// 4. Add the current number to our hash table
			map.put(nums[i], i);
		}

		return false;
	}

}
