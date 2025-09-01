package com.example.demo.questions;

import java.util.Arrays;

public class MoveZerosToLeft {
    public static void moveZerosToLeft(int[] arr) {
        int n = arr.length;
        int right = n - 1; // Start from the rightmost index

        // Traverse from right to left
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] != 0) {
                arr[right] = arr[i];
                right--;
            }
        }
        // Fill remaining elements with zero from left to right
        while (right >= 0) {
            arr[right] = 0;
            right--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 0, 0, 3, 4};
        moveZerosToLeft(arr);
        System.out.println(Arrays.toString(arr)); // Output: [0, 0, 0, 1, 2, 3, 4]
    }
}
