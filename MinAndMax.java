package com.prep.misc;

/*Program to find Smallest and Largest Word in a String.
Input :This is a test string Output : Minimum length word: is Maximum length word: string*/

public class MinAndMax {
	
	public static String getMax(String in) {
		int maxLen = 0;
		String maxString = "";
		
		String[] input = in.split(" ");
		for(String word : input) {
			if(word.length() > maxLen) {
				maxString = word;
			}
		}
		return maxString;
	}

	public static void main(String[] args) {

		System.out.println(getMax("This is a test string"));
	}

}
