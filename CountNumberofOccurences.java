package com.arrays;

import java.util.HashMap;
import java.util.Map;

public class CountNumberofOccurences {

	public static void main(String[] args) {
		int arr[] = { 9, 8, 4, 9, 5, 4, 9, 1 };

		Map<Integer, Integer> countMap = countNumberofOccurences(arr);
		System.err.println("Number of Occurences "+countMap);
	}

	private static Map<Integer, Integer> countNumberofOccurences(int[] arr) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int num : arr) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}

		return map;
	}
}
