package com.prep.misc;

/*Given a sentence, task is to remove spaces from the sentence and rewrite in Camel case.
It is a style of writing where we don’t have spaces and all words begin with capital letters.*/

public class FormatSentence {
	
	public static String toCamelCase(String input) {
		String res = "";
		String[] arr = input.split(" ");
		for(String word : arr) {
			res += String.valueOf(word.charAt(0)).toUpperCase() + word.substring(1, word.length());
		}
		return res;
	}
	
public static void main(String[] args) {
		
		
		System.out.println(toCamelCase("hi you are beautiful"));

		
	}

}
