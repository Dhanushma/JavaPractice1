package com.java;

public class Atoi {

	public static void main(String[] args) {
		System.out.println(atoi("89789"));
	}
	
	public static int atoi(String input) {
		
		int res =0;
		for(int i=0;i<input.length();i++) {
			
			res = res * 10 + input.charAt(i) - '0';
		}
		return res;

	}

}
