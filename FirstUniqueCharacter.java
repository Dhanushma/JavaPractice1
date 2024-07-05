package com.java;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacter {
	
	public static char firstUniqueChar(String input) {
		Map<Character, Integer> map= new HashMap<>();
		char result = 0 ;
		char[] charInput = input.toCharArray();

		for(char c:charInput) {
			if(map.containsKey(c)) {
				int sum = map.get(c)+1;
				map.put(c, sum);
			}
			else {
				map.put(c, 1);
			}
		}
		for(int i =0;i<input.length();i++) {
			if(map.get(input.charAt(i))==1) {
				result = input.charAt(i);
				break;
			}
		}
		System.out.println(result);
		if(result==0) {
			System.out.println("No Unique Chars");
		}
		return result;	
	}
	public static void main(String[] args) {
		firstUniqueChar("hhggffdd");
		
	}
	

}
