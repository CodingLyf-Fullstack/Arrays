package com.example.demo.questions;

public class SecondLargest {

	public static void main(String a[]) {
		int arr[] = { 10, 5, 20, 8, 15 };

		int large = -1;
		int secondLarge = -1;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > large) {
				secondLarge = large;
				large = arr[i];
			} else if(arr[i] > secondLarge && arr[i] < large) {
				secondLarge = arr[i];
			}
		}
		System.out.println(secondLarge);
	}
}

//check element is greater than large, then the element become large and large become secondLarge
//check element is greater than secondLarge and less then large, then the element become secondLarge 