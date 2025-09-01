package com.arrays;

import java.util.Arrays;

public class TripletWithSumZero {

	public static void main(String[] args) {
		int[] arr = { -1, 0, 1, 2, -1, -4 };

		checkTriplets(arr);
	}

	private static boolean checkTriplets(int[] arr) {
		int n = arr.length;

		// Sort the array
		Arrays.sort(arr);

		// Fix one element and find pair with sum = -arr[i]
		for (int i = 0; i < n - 2; i++) {
			int left = i + 1;
			int right = n - 1;

			while (left < right) {
				int sum = arr[i] + arr[left] + arr[right];

				if (sum == 0) {
					System.out.println("Triplet found: " + arr[i] + ", " + arr[left] + ", " + arr[right]);
					return true;
				} else if (sum < 0) {
					left++;
				} else {
					right--;
				}
			}
		}
		return false;

	}
}
