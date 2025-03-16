package com.example.demo.questions;

import java.util.Arrays;

public class RotateKStepsReverse {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int k = 2;
		int n = arr.length;

		reverse(arr, 0, n - 1); // Reverse entire array:
		System.out.println("Reverse entire array: " + Arrays.toString(arr));

		reverse(arr, 0, k - 1); // Reverse first k elements:
		System.out.println("Reverse first k elements: " + Arrays.toString(arr));

		reverse(arr, k, n - 1); // Step 3: Reverse last 3 (n-k) elements
		System.out.println("Final output: " + Arrays.toString(arr));
	}

	static void reverse(int[] arr, int start, int end) {
		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
}
