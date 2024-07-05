package com.java;

import java.util.HashSet;

public class UniqueSubStringwithGivenLength {
	public static void main(String[] args) {
		System.out.println(getUnique("abbccde",2));
		
	}
	public static HashSet<String> getUnique(String input, int length) throws IllegalArgumentException{
		
		HashSet<String> resultSet = new HashSet<>();
		int inputStringLength = input.length();
		if(inputStringLength<length) {
			throw new IllegalArgumentException("Length of the tuple cannot be more than the length of the input string") ;
			
		}
		
		for(int i=0;i<inputStringLength-length+1;i++) {
			resultSet.add(input.substring(i,i+length));
		}
		return resultSet;
		
	}

}

 
