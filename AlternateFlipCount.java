package com.java;

public class AlternateFlipCount {

	public static void main(String[] args) {
		String in = "0001010111";
		int res = Math.min(flipCount(in,'0'), flipCount(in, '1'));
		System.out.println(res);

	}
	public static int flipCount(String input, char expected) {
		
		int count =0;
		for(int i =0;i<input.length();i++) {
			if(input.charAt(i)!=expected) {
				count++;
			}
			expected = findNextExpected(expected);
		}
		return count;
				
		
	}
	private static char findNextExpected(char expected) {

      char x = (expected=='0')? '1' : '0';
      return x;
	}

}
