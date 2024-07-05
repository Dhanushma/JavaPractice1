package com.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
	
	public static List<List<String>> getAnagramsList(String[]arr){
		List<List<String>> result = new ArrayList<>();
		
		HashMap<String,List<String>> map = new HashMap<>();
		for(String str:arr) {
			char[] words = str.toCharArray();
			Arrays.sort(words);
			String key = new String(words);
			
			if(map.containsKey(key)) {
				map.get(key).add(str);
			}
			else {
				List<String>arrList = new ArrayList<>();
				arrList.add(str);
				map.put(key, arrList);
			}
		}
		result.addAll(map.values());
		return result;
		
	}
	
	public static void main(String[] args) {
		String[] inputArray = {"eat", "tea", "tan", "ate", "nat", "bat"};
		List<List<String>> resultList = getAnagramsList(inputArray);
		resultList.forEach(t ->System.out.println(t + " "));
	}

}
