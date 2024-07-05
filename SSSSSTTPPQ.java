package com.java;

public class SSSSSTTPPQ {

	public static void main(String[] args) {
		System.out.println(getFormattedString("aaabb"));
	}

	public static String getFormattedString(String input) {

		String finalString = "";
		for (int start = 0; start < input.length(); start++) {
			char current = input.charAt(start);
			int sum = 0;
			for (int end = start; end < input.length(); end++) {
				if (input.charAt(start) == input.charAt(end)) {
					sum++;
					

				} else {

					start = start + end-1;
					break;
				}
			}
			finalString += sum+Character.toString(current);

		}
		return finalString;
	}

}
