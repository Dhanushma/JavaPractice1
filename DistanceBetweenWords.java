package com.java;

public class DistanceBetweenWords {

	public static void main(String[] args) {
		getMinDisatnce("geeks for geeks contribute practice", "geeks", "practice");

	}

	public static int getMinDisatnce(String s, String w1, String w2) {

		String[] words = s.split("[,. ]");
		int minDistance = words.length;
		for(int i =0;i<words.length;i++) {
			if(words[i].equals(w1)) {
				for(int j=0;j<words.length;j++) {
					if(words[j].equals(w2)) {
						int distance = Math.abs(j-i-1);
					minDistance = Math.min(minDistance, distance);
					}
				}
			}
		}
		System.out.println(minDistance);
		return minDistance;

	}

}
