package com.prep;

/*
Question: 
Combine ingredients in a specific order, any of which may be repeated

As an example, consider the following  
(A,B,C,D) in 11 steps: A, B, A, B, C, A, B, A, B, C, E 

Encode the string above using only 6 characters: A,B,*,C,*,E

Implement function that takes as input an un-encoded potion and returns the 
minimum number of characters required to encode

*/

public class MagicPotion {
	public static int minimalSteps(String s1) {
		int n = s1.length();
		int[] dp = new int[n];
		dp[0] = 1;

		for (int i = 1; i < n; i++) {
			if (i % 2 == 1 && isRepeat(s1, 0, i / 2, i)) {
				dp[i] = dp[i / 2] + 1;
			} else {
				dp[i] = dp[i - 1] + 1;
			}
		}
		return dp[n - 1];

	}

	public static boolean isRepeat(String s, int i, int j, int k) {
		return (s.substring(i, j + 1).equals(s.substring(j + 1, k + 1)));
	}

	public static void main(String[] args) {

		if (minimalSteps("ABCDABCE") == 8 && minimalSteps("ABCABCE") == 5) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
	}
}
