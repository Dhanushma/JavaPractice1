package com.prep;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LongestUniformString {

	  private static final Map<String, int[]> testCases = new HashMap<String, int[]>();

		/*
		 * static int[] longestUniformSubstring(String input){ int longestStart = 0; int
		 * longestLength = 1;
		 * 
		 * if(input.length() == 1){ return new int[]{0, 1}; } if(input.length() == 0){
		 * return new int[]{-1, 0}; }
		 * 
		 * for(int i = 0; i < input.length(); i++){ int count = 1; int start = i;
		 * for(int y = i + 1; y < input.length()-1; y++ ){
		 * 
		 * if(input.charAt(i) != input.charAt(y)){
		 * 
		 * if(count>longestLength){ longestLength = count; longestStart = start;
		 * 
		 * } i = y -1; break; } else{ count ++; } }
		 * 
		 * 
		 * } System.out.println(longestStart +"," + longestLength); return new
		 * int[]{longestStart,longestLength};
		 * 
		 * // your code goes here }
		 */
	  public static int[] longestUniformSubstring(String s){
	        if(s.length() == 0) return new int[]{-1,0};
	        if(s.length() == 1) return new int[]{0,1};
	        int idx = -1;
	        int maxCharCount = 0;
	        int count = 1;
	        int i;
	        for(i = 1; i < s.length(); i++){
	            if(s.charAt(i) == s.charAt(i - 1)){
	                count++;
	            }else{
	                if(count > maxCharCount){
	                    maxCharCount = count;
	                    idx = i - count;
	                }
	                count = 1;
	            }
	        }
	        if(count > maxCharCount){
	            maxCharCount = count;
	            idx = i - count;
	        }
	       return new int[]{idx, maxCharCount};
	}
	  
	  
	  public static void main(String[] args) {
	    testCases.put("", new int[]{-1, 0});
	    testCases.put("10000111", new int[]{1, 4});
	    testCases.put("aabbbbbCdAA", new int[]{2, 5});

	    boolean pass = true;
	    for(Map.Entry<String,int[]> testCase : testCases.entrySet()){
	      int[] result = longestUniformSubstring(testCase.getKey());
	      pass = pass && (Arrays.equals(result, testCase.getValue()));
	    }
	    if(pass){
	      System.out.println("Pass!");
	    } else {
	      System.out.println("Failed! ");
	    }
	  }
	}
