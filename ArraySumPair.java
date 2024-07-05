package com.java;

import java.util.ArrayList;
import java.util.List;

public class ArraySumPair {

	public static void main(String[] args) {
		int[] array = {12,13,5,22,3,16,44};
		System.out.println(findArraySumPair(array,25));
	}

	public static List<List<Integer>> findArraySumPair(int[] arr, int sum) {
		List<List<Integer>> resultList = new ArrayList<>();
		for (int start = 0; start < arr.length; start++) {
			for (int end = start + 1; end < arr.length; end++) {

				if (arr[start] + arr[end] == sum) {
					List<Integer> numList = new ArrayList<>();
					numList.add(start);
					numList.add(end);
					resultList.add(numList);

				}
			}
		}
		System.out.println(resultList.size());

		return resultList;

	}

}
