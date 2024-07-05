package com.java;

import java.util.Arrays;

public class Platform {

	public static void main(String[] args) {
		int arr[] = { 900, 940, 950, 1100, 1500, 1800 };
        int dep[] = { 910, 1200, 1120, 1130, 1900, 2000 };
        System.out.println(getPlatforms(arr, dep));
	}
	public static int getPlatforms(int arr[], int[] dep) {
		
		Arrays.sort(arr);
		Arrays.sort(dep);
		int n = arr.length;
		int platform =1;
		int result =1;
		int j =0;
		int i =1;
		
		while(i<n && j<n) {
			
			if(arr[i]<=dep[j]) {
				i++;
				platform++;
			}
			else if(arr[i]>dep[j]){
				platform--;
				j++;
				
			}
			result = Math.max(platform, result);
		}
		return result;
	}

}
