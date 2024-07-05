package com.java;

public class PowerProblem {

	public static void main(String[] args) {
		System.out.println(isPower(27,729));
		System.out.println(anotherMethod(27,729));

	}

	public static boolean isPower(int x, int y) {

		while (y > 1 && y % x == 0) {
			y = y / x;
		}
		return y == 1;
	}
	
	public static boolean anotherMethod(int x, int y) {
		int res = (int) (Math.log(y)/Math.log(x));
		double result = Math.log(y)/Math.log(x);
		return (res==result);
	}

}
