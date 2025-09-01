package com.arrays;

import java.util.ArrayList;
import java.util.List;

public class SubsetsRecursive {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        List<Integer> current = new ArrayList<>();
        printSubsets(arr, 0, current);
    }

    // Recursive function to print subsets
    private static void printSubsets(int[] arr, int index, List<Integer> current) {
        if (index == arr.length) {
            System.out.print(current+" , ");
            return;
        }

        // Include the current element
        current.add(arr[index]);
        printSubsets(arr, index + 1, current);

        // Exclude the current element (backtrack)
        current.remove(current.size() - 1);
        printSubsets(arr, index + 1, current);
    }
}
