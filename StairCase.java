package com.prep;

/*

** There is a staircase with 'n' number of steps. A child
** walks by and wants to climb up the stairs, starting at
** the bottom step and ascending to the top.instead
** of taking 1 step at a time, it will vary between taking
** either 1, 2 or 3 steps at a time.
** Given 'n' number of steps below method should find
** number of
** unique combinations the child could traverse.
** An example would be countSteps(3) == 4:
** 1 1 1
** 2 1
** 1 2
** 3
*/

class StairCase {
	public static Integer countSteps(Integer n) {
		if (n < 1) {
			return n;
		}
		int[] dp = new int[n + 1];
		dp[0] = 1;
		dp[1] = 1;
		dp[2] = 2;
		for (int i = 3; i <= n; i++) {

			dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];

		}
		return dp[n];

	}

	public static boolean doTestsPass() {
		return countSteps(3) == 4 && countSteps(4) == 7;
	}

	public static void main(String[] args) {
		if (doTestsPass()) {
			System.out.println("All tests pass");
		} else {
			System.out.println("Tests fail.");
		}

		
	}
}
