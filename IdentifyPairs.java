package com.java;

import java.util.ArrayList;
import java.util.List;

public class IdentifyPairs {

	public static void main(String[] args) {
		List<Integer> inList = new ArrayList<>();
		for(int k =1;k<20;k++) {
			inList.add(k);
		}
		System.out.println(getPairs(inList));
	}
	
	static List<List<Integer>> getPairs(List<Integer> inputList){
		List<List<Integer>> pairList = new ArrayList<>();
		for(int i =0;i<inputList.size();i++) {
			for(int j=i+1;j<inputList.size();j++) {
				if(Math.pow(i, j) == Math.pow(j, i)) {
					List<Integer> pairs = new ArrayList<>();
					pairs.add(i);
					pairs.add(j);
					pairList.add(pairs);
				}
				
			}
		}
		return pairList;
		
		
	}

}
