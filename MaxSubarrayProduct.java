package com.arrays;

public class MaxSubarrayProduct {

	public static void main(String[] args) {
		int[] arr = { 2, 3, -2, 4 };
		System.err.println("Max Product of Subarray " + findMaxProductofSubarray(arr));
		
		int[] arr1 = {1, -2, -3, 4, -1, 2, 1};
		
		System.err.println("Max Product of Subarray " + findMaxProductofSubarray(arr1));
	}

	private static int findMaxProductofSubarray(int[] arr) {
		int maxProduct = arr[0];
		int currentProduct = arr[0];

		for (int i = 1; i < arr.length; i++) {

			currentProduct = Math.max(arr[i], arr[i] * currentProduct);
			maxProduct = Math.max(maxProduct, currentProduct);
		}

		return maxProduct;
	}
}
