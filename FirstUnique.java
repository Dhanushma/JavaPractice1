package com.practice;

import java.util.HashMap;
import java.util.Map;

public class FirstUnique {
	public static void main(String[] args) {
	    String input ="hhgagffmdd";
	    char result =0;
	    Map<Character,Integer> map = new HashMap<>();
	    char[] arr = input.toCharArray();
	    for(char c:arr) {
	    	if(map.containsKey(c)) {
	    		map.put(c, map.get(c)+1);
	    	}
	    	else {
	    		map.put(c, 1);
	    	}
	    }
	    for(char in:arr) {
	    	if(map.get(in)==1) {
	    		System.out.println(in);
	    		result = in;
	    		break;
	    	}
	    }
	    
	    
		}
}