package com.prep.misc;

/*Reverse individual words. Given a string str, we need to print reverse of individual words.
*/
public class ReverseIndividualWords {

	public static String reverse(String input) {

		String out = "";
		String[] words = input.split(" ");
		
		for (String word : words) {
			out += reverseEach(word) + " ";
		}
		
		return out;
	}

	private static String reverseEach(String word) {
		String reversed = "";
		
		for (int i = word.length() - 1; i >= 0; i--) {
			reversed += word.charAt(i);
		}
		
		return reversed;
	}

	public static void main(String[] args) {

		System.out.println(reverse("Ravi had been saying that he had been there"));
	}

}
