package com.prep.misc;

public class DivisibleBy3 {

	public static void main(String[] args) {
		int[] input = new int[] { 40, 50, 90 };
		System.out.println(isDiv(input, 3));
	}

	public static boolean isDiv(int[] arr, int n) {

		int remainder = 0;
		for (int i = 0; i < arr.length; i++) {

			remainder = (remainder + arr[i]) % n;
		}

		return remainder == 0;
	}

}
