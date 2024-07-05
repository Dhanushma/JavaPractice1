package com.java;

public class LargestPalindrome {

	public static void main(String[] args) {
		String input="forgeeksskeegfor";
		int maxLenth =1;
		int start = 0;
		
		for(int i=0;i<input.length();i++) {
			for(int j=i;j<input.length();j++) {
				int flag=1;
				for(int k=0;k<(j-i+1)/2;k++) {
					if(input.charAt(i+k)!=input.charAt(j-k)) {
						flag=0;
					}
					
				}
				if(flag!=0 && (j-i+1)>maxLenth ) {
					start=i;
					maxLenth=j-i+1;
				}
			}
		}
		System.out.println(input.substring(start,start+maxLenth));

		
	}
	
	
	

}
