package com.example.demo.questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SortMapByValues {
    public static void main(String[] args) {
        // Example HashMap
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Alice", 45);
        scores.put("Bob", 30);
        scores.put("Charlie", 75);
        scores.put("David", 60);

        System.out.println("Original Map: " + scores);
        
        Set<Entry<String,Integer>> set = scores.entrySet();
        
        List<Entry<String,Integer>> list = new ArrayList<>(set);
        
        list.sort(Map.Entry.comparingByValue());
        
        System.err.println(list);
        
        Map<String, Integer> scoredScores = new LinkedHashMap<>();
        for(Entry<String,Integer> entry: list) {
        	scoredScores.put(entry.getKey(), entry.getValue());
        }
        System.err.println("Soreted hashmap by values "+scoredScores);
    }
    
}

