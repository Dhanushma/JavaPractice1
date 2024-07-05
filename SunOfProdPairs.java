package com.prep.misc;

/*
Given an array A[] of integers find sum of product of all pairs of array elementsInput : A[] = {1, 3, 4}
Output : 19Possible Pairs : (1,3), (1,4), (3,4)Sum of Product : 1*3 + 1*4 + 3*4 = 19*/

public class SunOfProdPairs {
	
	public static int findSum(int[] arr) {
		
		int res = 0;
		// i =0 , 1
		for(int i = 0; i < arr.length; i++) {
			// i =0, j =1, 2  i = 1 j = 2
			for(int j = i+1; j<arr.length; j++) {
				// res = 3 + 4 + 12
				res += arr[i] * arr[j];
			}
		}
		return res;
	}

	public static void main(String[] args) {
		
		int[] input = new int[] {1,3,4};
		System.out.println(findSum(input));
		
	}

}
