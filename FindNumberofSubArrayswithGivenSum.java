package com.arrays;

public class FindNumberofSubArrayswithGivenSum {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 2, 3, 1 };
		int target = 5;

		findSubArrayWithGivenSum(arr, target);

	}

	private static void findSubArrayWithGivenSum(int[] arr, int targetSum) {
		int start = 0, end = 0, currentSum = 0;
		int count=0 ;
		while (end < arr.length) {
			currentSum += arr[end];

			while (currentSum > targetSum && start < end) {
				currentSum -= arr[start];
				start++;
			}

			if (currentSum == targetSum)
				count++;

			end++;
		}
		System.out.println("Sub Arrays count " + count);

	}
}
