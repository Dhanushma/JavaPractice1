package com.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrangeNumberToBiggest {

	public static void main(String[] args) {
		List<String> numList = new ArrayList<>();
		numList.add("1");
		numList.add("34");
		numList.add("3");
		numList.add("98");
		numList.add("9");
		numList.add("76");
		numList.add("45");
		numList.add("4");
		
		printLargest(numList);
		
	}
	
	public static void printLargest(List<String> numList) {
		Collections.sort(numList, new Comparator<String>() {

			@Override
			public int compare(String x, String y) {
				String xy = x+y;
				String yx = y+x;
				return xy.compareTo(yx) > 0 ? -1 : 1;
			}
		});
		for(String nums:numList) {
			System.out.print(nums);
			
		}
		
	}

}
