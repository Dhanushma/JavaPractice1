package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListPractice {
	public static void main(String[] args) {
		List<String> arrayList = new ArrayList<String>();
		arrayList.add("Hello");
		arrayList.add("War");
		arrayList.add("Poll");

		//Collections.sort(arrayList);
		Collections.sort(arrayList, Collections.reverseOrder());
		for(String list:arrayList) {
			System.out.println(list);
		}
		System.out.println(arrayList.contains("War"));
		
		//list to array
		String[] arr = arrayList.toArray(new String[arrayList.size()]);
		System.out.println(Arrays.toString(arr));
	}
}
