package com.arrays;

public class SecondSmallestAndLargest {

	public static void main(String[] args) {
		int[] arr = { 2, 5, 6, 4, 1, 3, 10, 8, 7 };

		int largest = arr[0], secondLargest = arr[0];

		int smallest = arr[0], secondSmallest = arr[0];

		for (int i = 1; i < arr.length; i++) {
			int num = arr[i];
			if (num > largest) {
				secondLargest = largest;
				largest = num;
			} else if (num > secondLargest && num != largest) {
				secondLargest = num;
			}

			if (num < smallest) {
				secondSmallest = smallest;
				smallest = num;
			} else if (num < secondSmallest && num != smallest) {
				secondSmallest = num;
			}
		}

		System.err.println(" Second Largest  " + secondLargest);
		System.err.println(" Second Smallest " + secondSmallest);
	}
}
