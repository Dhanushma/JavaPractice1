package com.prep.misc;

import java.util.Arrays;
import java.util.List;
/*Given a string and a delimiter character. 
Split the string based on the delimiter and print the list of resulting sub strings.*/

public class SplitString {

	public static void main(String[] args) {
		System.out.println(getList("Hello.beauty", "."));

	}
	static List<String> getList(String input, String del){
		
		String[] arr = input.split("["+del+"]");
		return Arrays.asList(arr);
		
	}

}
