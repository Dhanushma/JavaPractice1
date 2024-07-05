package com.java;

public class MedianSortedArray {

	public static double findMedianSortedArrays(int[] A, int[] B) {
		int[] newSortedArray = new int[A.length + B.length];
		mergeArrays(A, B, A.length, B.length, newSortedArray);
		return findMedian(newSortedArray);
	}

	public static void mergeArrays(int[] arr1, int[] arr2, int n1, int n2, int[] arr3) {
		int i = 0, j = 0, k = 0;
		while (i < n1 && j < n2) {
			if (arr1[i] < arr2[j])
				arr3[k++] = arr1[i++];
			else
				arr3[k++] = arr2[j++];
		}
		while (i < n1)
			arr3[k++] = arr1[i++];
		while (j < n2)
			arr3[k++] = arr2[j++];

	}

	public static double findMedian(int[] newSortedArray) {
		double median;
		if (newSortedArray.length % 2 == 0)
			median = ((double) newSortedArray[newSortedArray.length / 2]
					+ (double) newSortedArray[newSortedArray.length / 2 - 1]) / 2;
		else
			median = (double) newSortedArray[newSortedArray.length / 2];

		return median;
	}

	public static void main(String[] args) {
		System.out.println(findMedianSortedArrays(new int[]{1, 3}, new int[]{2, 4}));
	 
	}
}
