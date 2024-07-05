package com.prep.misc;

import java.util.HashMap;
import java.util.Map;

/*Find winner of an election where votes are represented as candidate names.
Given an array of names of candidates in an election.
A candidate name in array represents a vote casted to the candidate.Print the name of candidates received Max vote.
If there is tie, print lexicographically smaller name.*/
public class Winner {
	
	public static String findWinner(String[] arr) {
		
		Map<String, Integer> map = new HashMap<>();
		int highest = 0;
		String winner = "";
		
		for(String candidate : arr) {
			map.put(candidate, map.getOrDefault(candidate, 0) + 1);
		}
		//System.out.println(map);
		
		for(String cand : map.keySet()) {
			if(map.get(cand) > highest) {
				highest = map.get(cand);
				winner = cand;
			}
			else if(map.get(cand) == highest) {
				int i = winner.compareTo(cand);
				winner =  (i<1) ? winner : cand;
			}
		}
		
		return winner;
		
	}

	public static void main(String[] args) {
		String[] input = new String[] {"A","B","C", "C","C","B","B"};
		
		System.out.println(findWinner(input));

	}

}
