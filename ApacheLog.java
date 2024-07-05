package com.java;

import java.util.HashMap;
import java.util.Map;

public class ApacheLog {

	public static void main(String[] args) {
		getFrequent(new String[] { "10.0.0.1 - GET 2020-08-24", "10.0.0.1 - GET 2020-08-24",
				"10.0.0.2 - GET 2020-08-20", "10.0.0.3 - GET 2020-08-24", "10.0.0.3 - GET 2020-08-24",
				"10.0.0.3 - GET 2020-08-24", "10.0.0.4 - GET 2020-08-24", });
	}

	public static String getFrequent(String[] lines) {
		Map<String, Integer> numberMap = new HashMap<>();
		int max = 0;
		String res = "";
		for (String singleLine : lines) {
			String[] inArray = singleLine.split(" ");
			String IpAddress = inArray[0];
			numberMap.put(IpAddress, numberMap.getOrDefault(IpAddress, 0) + 1);
			int current = numberMap.get(IpAddress);
			if (current > max) {
				max = current;
				res = IpAddress;
			}
		}
		// Your code goes here
		return res;
	}

}
