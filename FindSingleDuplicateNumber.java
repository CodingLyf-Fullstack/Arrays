package com.example.demo.questions;

import java.util.Arrays;

public class FindSingleDuplicateNumber {
	
	static int findDuplicate(int[] arr) {
		int[]  freq = new int[Arrays.stream(arr).max().getAsInt() + 1];
		
		for(int a:arr) {
			if(freq[a] ==0) {
				++freq[a];
			} else {
				return a;
			}
		}
		return 0;
    }
	
	public static void main(String a[]) {
		int arr[] = {1,3,6,2,3};
        System.out.println("The duplicate element is " + findDuplicate(arr));

	}

}
