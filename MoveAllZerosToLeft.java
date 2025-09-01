package com.arrays;

import java.util.Arrays;

/**
 * This program moves all zeros in an array to the left while maintaining the
 * order of non-zero elements.
 *
 * Idea: 1. Create a new array of the same length. 2. Traverse the original
 * array: - Count the zeros. - Place non-zero elements from the end of the new
 * array backward. 3. Fill the remaining positions at the start with zeros.
 */
public class MoveAllZerosToLeft {

	public static void main(String[] args) {
		int[] arr = { 0, 2, 3, 0, 0, 1, 4, 0, 0 };

		System.err.println("Move all zeros to left: " + Arrays.toString(moveAllZerosToLeft(arr)));
		// Expected Output: [0, 0, 0, 0, 0, 2, 3, 1, 4]
	}

	private static int[] moveAllZerosToLeft(int[] arr) {
		int[] newArray = new int[arr.length]; // New array to store result
		int right = arr.length - 1; // Pointer starting from the end
		int zeroCount = 0; // Count of zeros

		// Place non-zero elements from the end
		for (int num : arr) {
			if (num == 0) {
				zeroCount++; // Count zeros
			} else {
				newArray[right] = num; // Place non-zero at the end
				right--;
			}
		}

		// Fill the remaining positions with zeros
		while (zeroCount > 0) {
			newArray[right] = 0;
			right--;
			zeroCount--;
		}

		return newArray;
	}
}
