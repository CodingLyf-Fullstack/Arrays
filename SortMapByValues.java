package com.example.demo.questions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * This program sorts a Map by its values in ascending order.
 *
 * Idea:
 * 1. Get the entry set of the map.
 * 2. Convert the entry set into a List (so we can sort it).
 * 3. Sort the list using `Map.Entry.comparingByValue()`.
 * 4. Create a LinkedHashMap to preserve the sorted order when inserting entries back.
 */
public class SortMapByValues {

    public static void main(String[] args) {
        // Example HashMap
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Mahesh", 45);
        scores.put("NTR", 30);
        scores.put("Chiru", 75);
        scores.put("Ballaya", 60);

        System.out.println("Original Map: " + scores);

        // Step 1: Get entry set
        Set<Entry<String, Integer>> set = scores.entrySet();

        // Step 2: Convert to a list
        List<Entry<String, Integer>> list = new ArrayList<>(set);

        // Step 3: Sort the list by values
        list.sort(Map.Entry.comparingByValue());

        System.err.println("Sorted Entry List: " + list);

        // Step 4: Transfer sorted entries into LinkedHashMap to preserve order
        Map<String, Integer> sortedMap = new LinkedHashMap<>();
        for (Entry<String, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        System.err.println("Sorted Map by Values: " + sortedMap);
    }
}
