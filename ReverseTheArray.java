package com.example.demo.questions;

import java.util.Arrays;

import ch.qos.logback.core.rolling.LengthCounter;

public class ReverseTheArray {
	public static void main(String[] args) {
		System.out.println("sdfsdf");
		int arr[] = { 1, 2, 3, 4, 5 };

//	 Use two pointers, left starting at the beginning of the array and right starting at the end.
		int left = 0; // Start pointer
		int right = arr.length - 1; // End pointer

		while (left < right) {
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			
			left++;
			right--;
		}
		
		
		System.out.println(Arrays.toString(arr));
	}
	
	
}
