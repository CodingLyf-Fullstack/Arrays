package com.arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

public class FindSubArrayWithGivenSum {

	public static void main(String[] args) {
//		int[] arr = {1,2,2,3,1};
		int arr[] = { 1, 2, 3, 7, 5 };
		int target = 12;

		findSubArrayWithGivenSum(arr, target);

	}

	private static void findSubArrayWithGivenSum(int[] arr, int targetSum) {
		int start = 0, end = 0, currentSum = 0;
		while (end < arr.length) {
			currentSum += arr[end];

			while (currentSum > targetSum && start < end) {
				currentSum -= arr[start];
				start++;
			}

			if (currentSum == targetSum)
				break;

			end++;
		}
		System.err.println("Indexes of sub array; start: " + start + " end:" + end);
		int[] subArray = IntStream.range(start, end + 1).map(i -> arr[i]).toArray();
		System.out.println("Sub Array " + Arrays.toString(subArray));

	}
}
