package com.prep.misc;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/*Find the first repeated word in a string.
Input : "Ravi had been saying that he had been there" .Output : had*/
public class FirstRepeatedWord {

	public static String firstRepeated(String input) {

		LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
		String res = "";

		for (String word : input.split(" ")) {
			if (map.containsKey(word)) {
				res = word;
				break;
			} else {
				map.put(word, 1);
			}
		}

		return res;

	}

	public static void main(String[] args) {
		System.out.println(firstRepeated("Ravi had been saying that he had been there"));
	}

}
