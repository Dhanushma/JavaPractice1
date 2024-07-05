package com.prep.misc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TopVideos {

	static class Video {

		String name;
		int watchRate;

		public Video(String name, int watchRate) {
			this.name = name;
			this.watchRate = watchRate;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getWatchRate() {
			return watchRate;
		}

		public void setWatchRate(int watchRate) {
			this.watchRate = watchRate;
		}

		@Override
		public String toString() {
			return "Video [name=" + name + ", watchRate=" + watchRate + "]";
		}
		
		
		

	}

	public static void getTop(List<Video> videoList){
		
		Map<String, Integer> map = new HashMap<>();
		
	for(Video vid : videoList) {
		String videoName = vid.getName();
		int rate = vid.getWatchRate();
		if(map.containsKey(videoName)) {
			map.put(videoName, map.get(videoName) + rate);
		}
		else {
			map.put(videoName, rate);
		}
		
	}
    List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
	Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
		@Override
		public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
			return o2.getValue() - o1.getValue();
		}
		
	});
	
	for(int i = 0; i<10; i++) {
		Map.Entry<String, Integer> listValue = list.get(i);
		System.out.println(listValue.getKey() + " , " + listValue.getValue());
	}
	
		
	}

	public static void main(String[] args) {
		List<Video> videos = new ArrayList<>();
        videos.add(new Video("abc", 10));
        videos.add(new Video("def", 20));
        videos.add(new Video("abc", 15));
        videos.add(new Video("ghi", 50));
        videos.add(new Video("xyz", 100));
        videos.add(new Video("abc", 25));
        videos.add(new Video("jkl", 10));
        videos.add(new Video("mno", 15));
        videos.add(new Video("pqr", 25));
        videos.add(new Video("stu", 35));
        videos.add(new Video("lko", 19));
        videos.add(new Video("aaa", 5));
        videos.add(new Video("bbb", 10));
        videos.add(new Video("ccc", 35));
        videos.add(new Video("abc", 25));
        videos.add(new Video("eee", 20));
        getTop(videos);
	}

}
