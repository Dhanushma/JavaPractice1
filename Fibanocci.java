package com.java;

public class Fibanocci {
	public static void main(String[] args) {
		System.out.println(findNumber(9));
		System.out.println(findRecFib(8));
	
	}
	
	public static int findNumber(int n) {
		int a1 =0;
		int a2 = 1;
		int a3 = 0;
		if(n<=1) {
			return n;
		}
		for(int i =2;i<=n;i++) {
			a3 = a1 + a2;
			a1 = a2;
			a2 = a3;
			
		}
		return a3;
		
	}
	
	public static int findRecFib(int number) {
		
		if(number<=1) {
			return number;
		}
		return findRecFib(number-2) + findRecFib(number-1);
		
	}

}
