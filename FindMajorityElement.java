package com.arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * This program finds the majority element in an integer array.
 *
 * Definition:
 * A majority element is the element that appears more than n/2 times in an array of size n.
 *
 * Idea:
 * 1. Use a HashMap to count occurrences of each element.
 * 2. Traverse the map to find an element whose count > n/2.
 * 3. If found, return that element; otherwise, return -1 (no majority element exists).
 */
public class FindMajorityElement {

    public static int findMajorityElementUsingMap(int[] nums) {
        int n = nums.length;

        // HashMap to store frequency of each element
        Map<Integer, Integer> map = new HashMap<>();

        // Count occurrences
        for (int a : nums) {
            map.put(a, map.getOrDefault(a, 0) + 1);
        }

        // Check for majority element
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > n / 2) {
                return entry.getKey();
            }
        }

        // No majority element found
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};

        int result = findMajorityElementUsingMap(nums);

        if (result != -1) {
            System.out.println("Majority Element: " + result);
        } else {
            System.out.println("No Majority Element Found");
        }
    }
}
