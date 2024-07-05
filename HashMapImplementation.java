package com.java;

import java.util.ArrayList;
import java.util.List;

public class HashMapImplementation {

	public static class HashMapImpl<K, V> {
		public static class Entry<K, V> {
			K key;
			V value;

			public Entry(K key, V value) {
				this.key = key;
				this.value = value;
			}
		}

		ArrayList<List<Entry<K, V>>> entries;

		public HashMapImpl() {
			entries = new ArrayList<>();
			for (int i = 0; i < 10; i++) {
				entries.add(new ArrayList<>());

			}

		}

		public int getIndex(K key) {
			return key.hashCode() % entries.size();
		}

		public void put(K key, V value) {
			if (key == null || value == null) {
				return;
			}
			int index = getIndex(key);
			for (Entry<K, V> in : entries.get(index)) {
				if (in.key.equals(key)) {
					in.value = value;
					return;
				}
			}
			entries.get(index).add(new Entry<>(key, value));

		}
		
		public V get(K key) {
			int index = getIndex(key);
			List<Entry<K,V>> list =  entries.get(index);
			for(Entry<K,V> node:list) {
				if(node.key.equals(key)) {
					return node.value;
				}
			}
			return null;

		}

	}

	public static void main(String[] args) {
		HashMapImpl<String,Integer> map = new HashMapImpl<>();
		map.put("Dhanu", 56);
		map.put("fgh", 76);
		map.put("itu", 24);
		
		
		System.out.println(map.get("Dhanu"));
		System.out.println(map.get("fgh"));
		System.out.println(map.get("itu"));



	}

}
