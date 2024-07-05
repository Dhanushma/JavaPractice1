package com.java;

public class SortArray {
	public static void main(String[] args) {
		int[] array = {7,5,12,3,9};
		System.out.println(findSecondLargest(array));
	}
	
	public static int findSecondLargest(int[]arr) {
		int tempValue =0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					tempValue = arr[i];
					arr[i] = arr[j];
					arr[j] = tempValue;
				}
			}
		}
		
		return arr[1];
	}

}
