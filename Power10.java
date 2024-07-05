package com.java;

public class Power10 {

	public static void main(String[] args) {
		System.out.println(isPowerOf10(20));
	}

	public static boolean isPowerOf10(long number) {

		while (number > 1 && number % 10 == 0) {
			number = number / 10;
		}
		if (number == 1) {
			return true;
		} else
			return false;
	}

}
