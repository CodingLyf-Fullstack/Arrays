package com.arrays;

public class MaxSubArrayWhoseLengthisK {

	public static void main(String[] args) {
		int[] arr = {2, 1, 5, 1, 3, 2};
		int k = 3;
		int sum = 0;
		 // Compute the sum of the first 'k' elements
		for(int i=0;i<k;i++) {
			sum+=arr[i];
		}
		// Initialize maxSum as the sum of the first window
		int maxSum = sum;
		
		for(int i=k;i<arr.length;i++) {
			sum += arr[i];      // Add new element entering window
            sum -= arr[i - k];  // Remove element leaving window
            maxSum = Math.max(maxSum, sum); // Update maxSum
			
		}
		System.err.println("Maximum sub array whose length is 3: "+maxSum);
	}
}
