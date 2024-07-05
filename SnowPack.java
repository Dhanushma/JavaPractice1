package com.java;

public class SnowPack {
	public static void main(String[] args) {
		int[] input = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
		System.out.println(getWater(input));
	}
	
	public static int getWater(int[] array) {
		
		int n = array.length;
		int water =0;
		int[] left = new int[n];
		int[] right = new int[n];
		
		//filling left array
		left[0] = array[0];
		for(int i =1;i<n;i++) {
			left[i] = Math.max(array[i], left[i-1]);
		}
		
		//filling right array
		right[n-1] = array[n-1];
		for(int j=n-2;j>=0;j--) {
			right[j] = Math.max(array[j], right[j+1]);
		}
		
		//find total water content
		for(int k =0;k<n;k++) {
			water += Math.min(right[k], left[k])-array[k];
		}
		
		return water;
	}


}
