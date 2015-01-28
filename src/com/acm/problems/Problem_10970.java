package com.acm.problems;

public class Problem_10970 {
	public static void main(String[] args) {
		
	}

	public static boolean arrayFront9(int[] nums) {
		int end = nums.length>4?4:nums.length;
		
		for (int i = 0; i < end; i++) {
			if (nums[i]==9) {
				return true;
			}
		}
		
		return false; 
	}
}
