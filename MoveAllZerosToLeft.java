package com.arrays;

import java.util.Arrays;

public class MoveAllZerosToLeft {

	public static void main(String[] args) {
		int[] arr = { 0, 2, 3, 0, 0, 1, 4, 0, 0 };

		System.err.println("Move all zeros to left " + Arrays.toString(moveAllZerosToLeft(arr)));
	}

	private static int[] moveAllZerosToLeft(int[] arr) {
		int[] newArray = new int[arr.length];
		int i = arr.length - 1;
		int count = 0;

		for (int num : arr) {
			if (num == 0) {
				count++;
			} else {
				newArray[i] = num;
				i--;
			}
		}

		while (count > 0) {
			newArray[i] = 0;
			i--;
			count--;
		}
		return newArray;
	}
}
