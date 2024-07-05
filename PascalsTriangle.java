package com.java;

public class PascalsTriangle {
	
	public static void main(String[] args) {
		System.out.println(getNuber(6,6));
		
	}
	public static int getNuber(int line, int pos) {
		int res = 1;
		for(int i =1;i<pos;i++) {
			res = res*(line-i)/i;
			
		}
		
		
		return res;
	}


}
