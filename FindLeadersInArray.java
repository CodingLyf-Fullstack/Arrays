package com.arrays;

import java.util.ArrayList;
import java.util.List;

public class FindLeadersInArray {

	public static void main(String[] args) {
		int arr[] = {16, 17, 4, 3, 5, 2};
		
		System.err.println("Leaders "+getLeaders(arr));
	}

	private static List<Integer> getLeaders(int[] arr) {
		List<Integer> list = new ArrayList<>();
		list.add(arr[arr.length-1]);
		
		int max=arr[arr.length-1];
		for (int i = arr.length - 2; i > 0; i--) {
			if(arr[i] > max) {
				list.add(arr[i]);
				max = arr[i];
			}
		}
		return list;
	}
}
