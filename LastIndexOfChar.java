package com.prep.misc;

//Given a string str and a character x, find last index of x in str.
public class LastIndexOfChar {
	
	public static int lastIndex(String input, char x) {
		int index = input.length();
		for(int i = input.length()-1; i >= 0; i--) {
			if(x == input.charAt(i)) {
				index = i;
			}
		}
		return index;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
