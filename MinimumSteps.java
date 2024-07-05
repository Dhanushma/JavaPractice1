package com.practice;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class MinimumSteps {

	static class Point {
		int x;
		int y;
		String path;

		public Point(int x, int y, String path) {
			this.x = x;
			this.y = y;
			this.path = path;

		}
	}

	public static void minSteps(int[] targetPos) {

		int[] dx = { 0, 1, 0, -1 };
		int[] dy = { 1, 0, -1, 0 };
		
		int minLen =100;
		Point initial = new Point(0, 0, "");
		Queue<Point> q = new LinkedList<>();
		Map<Point, Boolean> map = new HashMap<>();

		q.add(initial);
		while (!q.isEmpty()) {
			Point t = q.poll();
			if (t.x == targetPos[0] && t.y == targetPos[1] && t.path.length()<=minLen) {
				minLen = t.path.length();
				System.out.println(t.path);
			}
			int a, b;
			String currentPath ="";
			if (!map.getOrDefault(t, false)) {
				map.put(t, true);
			}
			for (int i = 0; i < 4; i++) {
				a = t.x + dx[i];
				b = t.y + dy[i];
				switch (i) {
				case (0):
					currentPath = "U";
					break;
				case (1):
					currentPath = "R";
					break;
				case (2):
					currentPath = "D";
					break;
				case (3):
					currentPath = "L";
					break;
				default:
					break;

				}
				Point p = new Point(a, b, t.path + currentPath);
				
				if (!map.getOrDefault(p, false) && !q.contains(p) && isPossible(a,b))
					q.add(p);
			}
		}
	}

	private static boolean isPossible(int a, int b) {
		if(a<=2 && a>=-2 && b<=2 && b>=-2)
		return true ;
		else
			return false;
	}

	public static void main(String[] args) {
		int[] targetPosition = { -2, 2 };
		minSteps(targetPosition);

	}

}
