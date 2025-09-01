package com.arrays;

import java.util.Arrays;

public class MergeArraysIntoSinlgeSortedArray {

	public static void main(String[] args) {
		
		int arr1[] = {2,3,5,4,1};
		int arr2[] = {8,7,6,10,9};
		
		System.err.println("Sorted Array "+ Arrays.toString(mergeArraysInSortedOrder(arr1, arr2)));
		
	}

	private static int[] mergeArraysInSortedOrder(int[] arr1, int[] arr2) {
		
		Arrays.sort(arr1); Arrays.sort(arr2);
		
		int mergedArray[] = new int[arr1.length+arr1.length];
		
		int minLength = Math.min(arr1.length, arr2.length);
		int i = 0,j = 0,k=0;
		while(i < minLength && j <minLength) {
			if(arr1[i] < arr2[j]) {
				mergedArray[k++] = arr1[i++];
			} else {
				mergedArray[k++] = arr2[j++];
			}
		}
		
		while(i < arr1.length) {
			mergedArray[k++]  = arr1[i++];
		}
		
		while(j < arr2.length) {
			mergedArray[k++]  = arr2[j++];
		}
		
		return mergedArray;
	}
}
