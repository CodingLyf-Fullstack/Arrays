package com.arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ReverseArray {

	public static void main(String[] args) {
		//With Streams
		int[] arr = {
				2,5,6,4,1,3
		};
		
		int outputArr[] = IntStream.range(0, arr.length).map(i -> arr[arr.length-i-1]).toArray();
		System.err.println(Arrays.toString(outputArr));
		
		//Without streams
		System.err.println(Arrays.toString(reverse(arr)));;
	}

	private static int[] reverse(int[] arr) {
		int left =0;
		int right = arr.length -1;
		while(left < right) {
			int temp = arr[right];
			arr[right] = arr[left];
			arr[left] = temp;
			left++;
			right--;
		}
		return arr;
		
	}
}
