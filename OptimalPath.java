package com.java;

public class OptimalPath {

	public static void main(String[] args) {
		System.out.println(getMaxRocks(new int[][] { { 0, 0, 0, 0, 5 }, { 0, 1, 1, 1, 0 }, { 2, 0, 0, 0, 0 } }));
	}

	public static int getMaxRocks(int[][] grid) {

		int row = grid.length;
		int col = grid[0].length;
		for (int i = row - 1; i >= 0; i--) {
			for (int j = 0; j < col; j++) {
				if (i < row - 1 && j > 0) {
					grid[i][j] += Math.max(grid[i + 1][j], grid[i][j - 1]);
				} else if (j > 0) {
					grid[i][j] += grid[i][j - 1];
				} else if (i < row - 1) {
					grid[i][j] += grid[i + 1][j];

				}
			}
		}
		return grid[0][col - 1];

	}

}
