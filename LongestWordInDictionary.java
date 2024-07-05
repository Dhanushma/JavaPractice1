package com.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class LongestWordInDictionary {

	public static void main(String[] args) {
		String[] array = {"to","toe","toes","doe","dog","god","dogs","book","banana"};
		// dsetog
		List<String> in =Arrays.asList(array);
		getLongest(in,"dsetog");
	}
	
	public static String getLongest(List<String> dict, String letters) {
		String result = "";
		for (String s : dict)
			if (s.length() >= result.length() && isWordOfLetters(s, letters))
				result = s;
		System.out.println(result);
		return result.length() == 0 ? null : result;
	}

	private static boolean isWordOfLetters(String s, String letters) {
		Map<Character, Integer> occ = new HashMap<Character, Integer>();
		for (char c : s.toCharArray())
			if (!occ.containsKey(c))
				occ.put(c, 1);
			else
				occ.put(c, occ.get(c) + 1);
		for (char c : letters.toCharArray())
			if (occ.containsKey(c))
				occ.put(c, occ.get(c) - 1);
		for (int i : occ.values())
			if (i > 0)
				return false;
		return true;
	}

}
