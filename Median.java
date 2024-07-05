package com.practice;

//find the median of the two sorted arrays.
// ex. {1, 3} and {2} is 2

public class Median {

	public static double logic(int[] A, int[] B) {
		int n1 = A.length;
		int n2 = B.length;
		double median;
		int[] combined = new int[n1 + n2];
		int length = n1 + n2;
		int i = 0;
		int j = 0;
		int k = 0;

		while (i < n1 && j < n2) {
			combined[k++] = (A[i] < B[j]) ? A[i++] : B[j++];
		}
		while (i < n1) {
			combined[k++] = A[i++];
		}
		while (j < n2) {
			combined[k++] = B[j++];
		}

		median = ((length) % 2 == 0) ? (combined[length / 2] + combined[length / 2 - 1]) / 2d : combined[length / 2];
		System.out.println(median);
		return median;

	}

	public static boolean pass() {
		boolean result = true;
		result = result && logic(new int[] { 1, 3 }, new int[] { 2, 4 }) == 2.5;
		return result;
	};

	public static void main(String[] args) {
		if (pass()) {
			System.out.println("pass");
		} else {
			System.out.println("some failures");
		}
	}
}
