package com.java;

public class Pangram {

	public static void main(String[] args) {
		System.out.println(getMissingchar("qwertyiopasdfghjklzxcvbn"));
	}

	public static String getMissingchar(String input) {
		String res = "";
		for (char c = 'a'; c <= 'z'; c++) {
			if (!input.contains(String.valueOf(c))) {
				res += String.valueOf(c);
			}

		}
		return res;
	}

}
