package com.java;

import java.util.LinkedList;

public class Election {

	public static void main(String[] args) {
		System.out.println(getStudent(4, 2));
	}

	public static int getStudent(int n, int k) {

		LinkedList<Integer> list = new LinkedList<>();
		for (int i = 1; i <= n; i++) {
			list.add(i);
		}
		int index = -1;
		while (list.size() > 1) {
			list.remove((index + k) % list.size());
			index = (index + k) % (list.size() + 1) - 1;

		}
		return list.getFirst();

	}
}
