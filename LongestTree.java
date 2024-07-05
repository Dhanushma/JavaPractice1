package com.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class LongestTree {

	public static void main(String[] args) {
		Map<Integer,Integer> testMap = new HashMap<>();
		testMap.put( 2, 3 );
		testMap.put( 7, 8 );
		testMap.put( 12, 15 );
		testMap.put( 3, 1 );
		testMap.put( 13, 15 );
		testMap.put( 11, 15 );
		testMap.put( 9, 8 );
		testMap.put( 5, 12 );
		System.out.println(findLargestTree(testMap));
	}
	
	public static int findLargestTree(Map<Integer,Integer> inputMap) {
		int minRootId =0;
		int maxtreeSize =0;
		Map<Integer,List<Integer>> parentTochild = new HashMap<>();
		List<Integer> rootList = new ArrayList<>();
		
		for(Map.Entry<Integer,Integer> childToParent:inputMap.entrySet()) {
			int childIndex = childToParent.getKey();
			int parentIndex = childToParent.getValue();
			parentTochild.putIfAbsent(parentIndex, new ArrayList<>());
			parentTochild.get(parentIndex).add(childIndex);
			if(!inputMap.containsKey(parentIndex)) {
				rootList.add(parentIndex);
			}
		}
		
		for(int root:rootList) {
			int treeSize = findTreeSize(root,parentTochild);
			if(treeSize>maxtreeSize) {
				maxtreeSize = treeSize;
				 minRootId = root;
			}
			else if(treeSize == maxtreeSize) {
				minRootId = Math.min(minRootId, root);
			}
		}
		return minRootId;
				
	}

	private static int findTreeSize(int root, Map<Integer, List<Integer>> parentTochild) {
		int result =0;
		Stack<Integer>nodes = new Stack<>();
		nodes.push(root);
		while(!nodes.isEmpty()) {
			int index = nodes.pop();
			for(int value:parentTochild.getOrDefault(index, new ArrayList<>())) {
			nodes.push(value);
			result++;
			}
		}
		return result;
	}

}
