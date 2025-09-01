package com.arrays;

import java.util.Arrays;

public class MoveallZerostoEnd {

	public static void main(String[] args) {
		int[] arr = { 0, 2, 3, 0, 0, 1, 4, 0, 0 };

		System.err.println("Output " + Arrays.toString(moveallZerostoEnd(arr)));
	}

	private static int[] moveallZerostoEnd(int[] arr) {
		int[] mergedArry = new int[arr.length];

		int i = 0, count = 0;
		for (int num : arr) {
			if (num == 0) {
				count++;
			} else {
				mergedArry[i] = num;
				i +=1;
			}
		}

		System.err.println(i+" - "+count);
		while (count > 0) {
			mergedArry[i] = 0;
			i+=1;
			--count;
		}

		return mergedArry;
	}
}
