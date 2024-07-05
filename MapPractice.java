package com.practice;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class MapPractice {
	public static void main(String[] args) {
		
		Map<Integer,String> newMap = new HashMap<Integer,String>();
		newMap.put(101, "Dhanu");
		newMap.put(105, "Ammu");
		newMap.put(106, "Appu");
		newMap.put(101, "Amal");
		
		for(Map.Entry m:newMap.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		
		newMap.entrySet().stream().sorted(Map.Entry.comparingByKey())
		.forEach(System.out::println);
		
		newMap.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
		.forEach(System.out::println);



	}

}
