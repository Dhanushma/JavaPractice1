package com.java;

public class NumberOfCyclesArray {
	public static void main(String[] args) {
		int[] nums1 = {1, 0};
		int s1 = 0;
		int[] nums2 = {1, 2, 0};
		int s2 = 0;
		int[] nums3 = {1, 2, 3, 1};
		int s3 = 0;
		int[] nums4 = {0, 1, 1, 1};
		int s4 = 0;
		//System.out.println(findCircle(nums1, s1));
		System.out.println(findCircle(nums2, s2));
		System.out.println(findCircle(nums3, s3)); 
		System.out.println(findCircle(nums4, s4)); 
		
	}

	private static int findCircle(int[] nums, int start) {
		int s = nums[start];
		int f = nums[nums[start]];
		int sSoFar = 1;
		if(s == f)
			return -1;
		while(s!=f) {
			s = nums[s];
			sSoFar++;
			f = nums[nums[f]];
		} 
		return sSoFar;
	}

}
