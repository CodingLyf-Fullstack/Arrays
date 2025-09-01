package com.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class FindArrayisSubset {

	public static void main(String[] args) {
		int arr1[] = { 5, 6, 8, 9, 2, 3 };

		int arr2[] = { 8, 9, 2 }; // This array is subset of arr1, return true

		int arr3[] = { 8, 9, 1 }; // This array is NOT a subset of arr2, return false

		System.err.println("Is array subset "+ checkSubsetorNot(arr1, arr2));
		System.err.println("Is array subset " + checkSubsetorNot(arr1, arr3));
	}

	private static boolean checkSubsetorNot(int[] arr1, int[] arr) {

		Set<Integer> hashSet = new HashSet<>();
		for (int num : arr1) {
			hashSet.add(num);
		}

		for (int num : arr) {
			if (!hashSet.contains(num)) {
				return false;
			}
		}

		return true;

	}
}
