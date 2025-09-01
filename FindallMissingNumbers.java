package com.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindallMissingNumbers {

	public static void main(String[] args) {
		int[] arr = { 2, 4, 6, 7, 9 };
		int n = Arrays.stream(arr).max().getAsInt();
		System.out.println("Missing numbers " + findMissingNumbers(arr, n));
	}

	static List<Integer> findMissingNumbers(int[] arr, int n) {
		List<Integer> missing = new ArrayList<Integer>();
		Set<Integer> set = new HashSet<Integer>();

		for (int a : arr) {
			set.add(a);
		}

		for (int i = 1; i <n; i++) {
			if (!set.contains(i)) {
				missing.add(i);
			}
		}

		return missing;

	}
}