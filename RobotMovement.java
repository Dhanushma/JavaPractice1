package com.java;

public class RobotMovement {

	public static void main(String[] args) {
		System.out.println(getFinal("UDDLRL"));
	}

	public static String getFinal(String input) {
		int[] res = { 0, 0 };
		for (char c : input.toCharArray()) {
			switch (c) {
			case ('D'):
				res[1] -= 1;
				break;
			case ('U'):
				res[1] += 1;
				break;
			case ('R'):
				res[0] += 1;
				break;
			case ('L'):
				res[0] -= 1;
				break;
			default:
				break;
			}
		}
		return res[0] + "," + res[1];

	}

}
