package com.java;

public class ReverseString {

	public static void main(String[] args) {
		System.out.println(reverse("abc"));
	}

	public static String reverse(String inputtr) {
		StringBuffer sb = new StringBuffer(inputtr);
		System.out.println(sb.reverse());

		String res = "";
		for (int i = inputtr.length()-1; i >= 0; i--) {
			res += inputtr.charAt(i);
		}
		return res;
	}
}
