package com.example.demo.sort;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {4,2,7,1,2}; // Initialize an array

        for (int i = 0; i < arr.length - 1; i++) {  // Outer loop for passes
            boolean swapped = false;  // Track swaps
            for (int j = 0; j < arr.length - 1 - i; j++) {  // Inner loop for comparisons
                if (arr[j] > arr[j + 1]) {  // Swap if needed
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;  // Exit early if already sorted
        }

        for (int num : arr) {
            System.out.print(num + " ");  // Print sorted array
        }
    }
}

