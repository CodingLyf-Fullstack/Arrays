package com.example.demo.questions;

import java.util.Arrays;

public class RotateKStepsReverse {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		int k = 3;
		int n = arr.length;

		reverse(arr, 0, n - 1);
		System.out.println("Reverse entire array: " + Arrays.toString(arr));
		
		reverse(arr, 0, k - 1); //
		System.out.println("Reverse first k elements: " + Arrays.toString(arr));
		
		reverse(arr, k, n - 1);
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
