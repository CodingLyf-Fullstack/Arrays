package com.example.demo.questions;

import java.util.*;

class FirstNonRepeating {
	public static int firstUnique(int[] arr) {
	    Map<Integer, Integer> countMap = new HashMap<>();

	    // Count occurrences
	    for (int num : arr) {
	        countMap.put(num, countMap.getOrDefault(num, 0) + 1);
	    }

	    // Find first non-repeating element
	    for (int num : arr) {
	        if (countMap.get(num) == 1) {
	            return num;
	        }
	    }

	    return -1; // If no unique element found
	}
	public static void main(String[] args) {
		int arr[] = {4, 5, 1, 2, 2, 5, 4, 3};
		int nonRepeatingNumber = firstUnique(arr);
		System.out.println("First non repeating number is: " + nonRepeatingNumber);
	}
}
