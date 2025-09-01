package com.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * This program finds the top K frequent elements in an array using a sorting-based approach.
 *
 * Idea:
 * 1. Build a frequency map of each element in the array.
 * 2. Convert the map entries into a list and sort it by frequency in descending order.
 * 3. Pick the top K elements from the sorted list.
 *
 * Example:
 * nums = [1,1,1,2,2,3], k = 2
 * Output: [1, 2]
 */
public class TopKFrequentElements {

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;

        System.err.println(Arrays.toString(topKFrequentElementsSortingApproach(nums, k)));
    }

    public static int[] topKFrequentElementsSortingApproach(int[] nums, int k) {
        // Step 1: Build the frequency map
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Sort the entries by frequency in descending order
        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(frequencyMap.entrySet());
        entryList.sort((a, b) -> b.getValue() - a.getValue());

        // Step 3: Extract the top K elements
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = entryList.get(i).getKey();
        }

        return result;
    }
}
