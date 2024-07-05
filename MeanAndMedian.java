package com.prep.misc;

import java.util.Arrays;

/*Given n size unsorted array, find its mean and median.
*/
public class MeanAndMedian {
	
	public static double findMean(int[] arr) {
		
		int sum = 0;
		for(int i =0; i < arr.length; i++) {
			sum += arr[i];
			
		}
		return (double)sum / arr.length ;
	}
	
	public static double findMedian(int[] arr) {
		// input = 3,6,2,7,5,4
		Arrays.sort(arr);
		// 2,3,4,5,6,7,9
		int n = arr.length;
		 return (n % 2 == 0) ? (arr[n / 2] + arr[n / 2 - 1]) / 2d : arr[n / 2];
	}

	public static void main(String[] args) {

		int[] input = new int[] {3,6,2,7,5,4,9};
		
		System.out.println(findMean(input));
		System.out.println(findMedian(input));

	}

}
