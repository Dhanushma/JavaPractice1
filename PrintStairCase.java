package com.prep.misc;

public class PrintStairCase {

	public static void main(String[] args) {
		printStairLeftCase(4);
		printStairRightCase(4);
	}
	
	public static void printStairLeftCase(int n) {
		
		for(int j = 1; j<= n; j++) {
			String res = "";
			for(int i = 1; i<=n; i++) {

				if(i <= j) {
					System.out.print("#");
				}
			}
			System.out.println();
		}
	}
	
	public static void printStairRightCase(int n) {
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
				if(j <= n-i) {
					System.out.print(" ");
				}
				else {
					System.out.print("#");
				}
			}
			System.out.println();
		}
	}


}
