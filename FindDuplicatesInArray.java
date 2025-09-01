package com.arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FindDuplicatesInArray {

	public static void main(String[] args) {
		int[] arr = { 2, 5, 6, 2, 1, 3, 1, 8, 3 };

		List<Integer> list = new ArrayList<>();
		HashSet<Integer> seen = new HashSet<>();
		for (int num : arr) {

			if(!seen.add(num)) {
				list.add(num);
			}
		}
		
		System.out.println(list);
	}
}


