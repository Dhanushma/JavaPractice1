package com.java;

public class UniqueSubstring {

	public static void main(String[] args) {
		String input = "aaabcbdeaf";
		int start =0;
		int maxLength=0;
		for(int i=0;i<input.length();i++) {
			for(int j=i;j<input.length();j++) {
				if(checkUnique(input,i,j)) {
					if(maxLength <j-i+1) {
						start =i;
					}
				}
			}
		}
		System.out.println(input.substring(start,start+maxLength));
		
		
	}
	static boolean checkUnique(String input,int start,int end) {
		int[] chars = new int[128];
		for(int i=start;i<=end;i++) {
			char c = input.charAt(i);
			chars[c]++;
			if(chars[c]>1) {
				return false;
			}
		}
		return true;
	}

}
