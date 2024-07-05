package com.java;

public class LongestFirstRepeatingIndex {
	//aabbbbddcc output[2,4]

	public static void main(String[] args) {
		getIndex("aabbbbddcc");
	}
	
	public static String getIndex(String arr) {
		String res ="";
		int temp = 0;

		for(int start=0; start<arr.length();start++) {
			int sum =1;
			int index1 = start;
			int index2 =0;
			for(int end = start+1; end<arr.length();end++) {
				if(arr.charAt(start) == arr.charAt(end)) {
					sum++;
				}
				else {
					start = end-1;
					break;
				}
				index2 = end;
				
			}
			
			if(temp<sum) {
				temp= sum;
				res = "["+index1+","+index2+"]";
			}
		}
		System.out.println(res);
		return res;
	}

}
