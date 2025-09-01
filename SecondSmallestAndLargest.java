package com.arrays;

package com.arrays;

/**
 * This program finds the second smallest and second largest elements in an integer array.
 *
 * Idea:
 * 1. We maintain two variables for largest and secondLargest.
 * 2. Similarly, two variables for smallest and secondSmallest.
 * 3. Traverse the array once, updating these variables whenever a new largest/smallest is found.
 * 4. For each element:
 *    - If it's bigger than the current largest, it becomes the new largest, and the old largest becomes secondLargest.
 *    - If it's smaller than the current smallest, it becomes the new smallest, and the old smallest becomes secondSmallest.
 *    - If it falls between largest and secondLargest, or smallest and secondSmallest, update the respective second values.
 */
public class SecondSmallestAndLargest {

    public static void main(String[] args) {
        int[] arr = { 2, 5, 6, 4, 1, 3, 10, 8, 7 };

        // Initialize largest and secondLargest to the first element
        int largest = arr[0], secondLargest = arr[0];

        // Initialize smallest and secondSmallest to the first element
        int smallest = arr[0], secondSmallest = arr[0];

        // Loop through the array starting from the second element
        for (int i = 1; i < arr.length; i++) {
            int num = arr[i];

            // Check for largest and secondLargest
            if (num > largest) {
                // num is the new largest, old largest becomes secondLargest
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                // num is between largest and secondLargest, update secondLargest
                secondLargest = num;
            }

            // Check for smallest and secondSmallest
            if (num < smallest) {
                // num is the new smallest, old smallest becomes secondSmallest
                secondSmallest = smallest;
                smallest = num;
            } else if (num < secondSmallest && num != smallest) {
                // num is between smallest and secondSmallest, update secondSmallest
                secondSmallest = num;
            }
        }

        // Print the results
        System.err.println("Second Largest  : " + secondLargest);
        System.err.println("Second Smallest : " + secondSmallest);
    }
}
