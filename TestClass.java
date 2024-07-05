package com.java;

import java.util.ArrayList;

public class TestClass {
	public static void main(String[] args) {
	    int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
	    getSpiralMatrix(3,3,arr);

}
	public static void getSpiralMatrix(int row, int col, int[][] arr) {
		int x = 0,y = 0,i =0;
		while(x<row && y<col) {
		for(i=y;i<col;i++) {
			System.out.println(arr[x][i] +" ");
		}
		x++;
		for(i=x;i<row;i++) {
			System.out.println(arr[i][col-1]);
		}
		col--;
		if(x<row)
		for(i=col-1;i>=y;i--) {
			System.out.println(arr[row-1][i]);
		}
		row--;
		if(y<col) {
		for(i=row-1;i>=x;i--) {
			System.out.println(arr[i][y]);
		}
		y++;
		}
	}
	}
}

