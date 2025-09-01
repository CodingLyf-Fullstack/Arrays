package com.arrays;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FindMajorityElement {
    
	public static int findMajorityElement(int[] nums)
	  {
	    int count = 0, candidate = -1;

	    // Finding majority candidate
	    for (int index = 0; index < nums.length; index++) {
	      if (count == 0) {
	        candidate = nums[index];
	        count = 1;
	      }
	      else {
	        if (nums[index] == candidate)
	          count++;
	        else
	          count--;
	      }
	    }

	    // Checking if majority candidate occurs more than
	    // n/2 times
	    count = 0;
	    for (int index = 0; index < nums.length; index++) {
	      if (nums[index] == candidate)
	        count++;
	    }
	    if (count > (nums.length / 2))
	      return candidate;
	    return -1;

	    // The last for loop and the if statement step can
	    // be skip if a majority element is confirmed to
	    // be present in an array just return candidate
	    // in that case
	  }

    
	public static int findMajorityElementUsingTreeMap(int[] nums) {
		int n = nums.length;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int a: nums) {
			map.put(a, map.getOrDefault(a, 0)+1);
		}
		
		for(Map.Entry<Integer, Integer> it: map.entrySet()) {
			if(it.getValue() > (n/2)) {
				return it.getKey();
			}
		}
		return -1;
	}
	public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        int result = findMajorityElementUsingTreeMap(nums);
        if (result != -1) {
            System.out.println("Majority Element: " + result);
        } else {
            System.out.println("No Majority Element Found");
        }
    }
}

//Boyer-Moore Majority Voting Algorithm
//Candidate Selection Phase:
//
//Traverse the array while keeping a count.
//If the count is 0, select the current element as the candidate.
//Increment the count if the current element is the same as the candidate, otherwise decrement the count.
//Candidate Validation Phase:
//
//Verify if the candidate is indeed the majority element by counting its occurrences in a separate pass.


//Initialization:
//
//Start with:
//candidate = 0 (an arbitrary initial value).
//count = 0 (to keep track of votes for the current candidate).
//Traverse the Array: For each element in the array:
//
//If count == 0:
//It means there's no active candidate.
//Action: Select the current element as the new candidate.
//Reason: Any element can become a candidate if the current votes for others are exhausted.
//Reset count to 1 because the new candidate has one vote.
//If the Current Element Equals the Candidate:
//Increment the count because the candidate gains support.
//If the Current Element Differs From the Candidate:
//Decrement the count because the candidate loses support due to a competing element.