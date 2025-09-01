package com.arrays;

public class MaxSubArraySum {

	public static void main(String args[]) {
		int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

		int n = arr.length;
		long maxSum = maxSubarraySum(arr, n);
		System.out.println("The maximum sub array sum is: " + maxSum);

	}

	private static long maxSubarraySum(int[] arr, int n) {
		int maxSum = arr[0];
		int currentSum = arr[0];
		for (int i = 0; i < n; i++) {
			currentSum = Math.max(arr[i], currentSum + arr[i]);
			maxSum = Math.max(maxSum, currentSum);
		}
		return maxSum;
	}

}
