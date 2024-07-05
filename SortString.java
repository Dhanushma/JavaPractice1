package com.prep.misc;

import java.util.Arrays;

/*Given a string, sort it in descending order. Input : mupursingh Output : uusrpnmihg
*/
public class SortString {
	
	public static String sort(String input) {
		String res = "";
		char[] arr = input.toCharArray();
		Arrays.sort(arr);
		String sorted = new String(arr);
		
		for(int i = sorted.length()-1; i >= 0; i--) {
			res += sorted.charAt(i);
		}
		
		return res;
	}

	public static void main(String[] args) {
		
		System.out.println(sort("mupursingh"));

	}

}
