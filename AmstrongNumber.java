package com.java;

public class AmstrongNumber {

	public static void main(String[] args) {
		System.out.println(checkAmstrong(1634));

	}
	
	public static boolean checkAmstrong(int number) {
		boolean result = false;
		int length =0, temp;
		int sum =0; int digit;
		temp = number;
		while(temp>0) {
			temp = temp/10;
			length++;
		}
		
		temp = number;
		while(temp>0) {
			digit = temp%10;
			sum += Math.pow(digit, length);
			temp = temp/10;
		}
		
		result = sum==number ? true : false ;
			
		
		return result;
	}

}
