package com.arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int[] arr = {1, 1, 2};
		
		int uniqueIndex = 0;
		int i=1;
		while(i < arr.length) {
			if(arr[i] != arr[uniqueIndex]) {
				uniqueIndex++;
				arr[uniqueIndex] = arr[i];
			}
			i++;
		}
		int[] arrayWithoutDuplicates = IntStream.range(0, uniqueIndex+1).map(index -> arr[index]).toArray();
		System.err.println(Arrays.toString(arrayWithoutDuplicates));
	}
}
