package p72x;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 */
public class Main723D {
	public static void main(String[] args) {
		run(System.in, System.out);
	}

	static int LAND = -2;
	static int OCEAN = -1;

	public static void run(InputStream in, PrintStream out) {

		try (Scanner sc = new Scanner(in)) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int k = sc.nextInt();

			int[][] map = new int[n][m];
			sc.nextLine();

			for (int i = 0; i < n; i++) {
				String s = sc.nextLine();
				for (int j = 0; j < s.length(); j++) {
					char c = s.charAt(j);
					if (c == '*') map[i][j] = LAND;
					else if (j == 0 || i == 0 || i == n - 1 || j == m - 1) map[i][j] = OCEAN;
					// else map = 0
				}
			}

			// Fill lakes
			int lakeidx = 0;
			Map<Integer, Integer> lakesize = new HashMap<>();

			for (int i = 0; i < map.length; i++) {
				for (int j = 0; j < map[i].length; j++) {
					if (map[i][j] == OCEAN) fill(map, n, m, i, j, OCEAN);
				}
			}
			for (int i = 0; i < map.length; i++) {
				for (int j = 0; j < map[i].length; j++) {
					 if (map[i][j] == 0) {
						lakeidx++;
						int size = fill(map, n, m, i, j, lakeidx);
						lakesize.put(lakeidx, size);
					}
				}
			}

			List<Integer> sortedlakes = lakeBySize(lakesize);

			dump(map);
			System.err.println(lakesize);
			System.err.println(sortedlakes);
			System.err.println("found " + lakeidx + " lakes");

			int nblaketofill = lakeidx - k;
			int nbcelltofill = 0;

			for (int i = 0; i < nblaketofill; i++) {
				nbcelltofill += lakesize.get(sortedlakes.get(i));
				fill(map, n, m, sortedlakes.get(i));
			}
			out.println(nbcelltofill);

			for (int i = 0; i < map.length; i++) {
				for (int j = 0; j < map[i].length; j++) {
					if (map[i][j] == LAND) out.print('*');
					else
						out.print('.');
				}
				out.println();
			}
		}
	}

	private static void fill(int[][] map, int n, int m, int lake) {
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				if (map[i][j] == lake) map[i][j] = LAND;
			}
		}
	}

	public static class Point {
		int x;
		int y;

		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}

		@Override
		public String toString() {
			return x + "/" + y;
		}
	}

	private static int fill(int[][] map, int n, int m, int i, int j, int lake) {
		Deque<Point> todo = new ArrayDeque<>();
		boolean[][] visited = new boolean[n][m];

		todo.add(new Point(i, j));
		visited[i][j] = true;
		int count = 0;
		while (!todo.isEmpty()) {
			Point p = todo.pop();
			count++;
			map[p.x][p.y] = lake;
			if (p.x > 0 && !visited[p.x - 1][p.y] && map[p.x - 1][p.y] == 0) {
				visited[p.x - 1][p.y] = true;
				todo.add(new Point(p.x - 1, p.y));
			}
			if (p.x < n - 1 && !visited[p.x + 1][p.y] && map[p.x + 1][p.y] == 0) {
				visited[p.x + 1][p.y] = true;
				todo.add(new Point(p.x + 1, p.y));
			}
			if (p.y > 0 && !visited[p.x][p.y - 1] && map[p.x][p.y - 1] == 0) {
				visited[p.x][p.y - 1] = true;
				todo.add(new Point(p.x, p.y - 1));
			}
			if (p.y < m - 1 && !visited[p.x][p.y + 1] && map[p.x][p.y + 1] == 0) {
				visited[p.x][p.y + 1] = true;
				todo.add(new Point(p.x, p.y + 1));
			}
		}
		return count;
	}

	private static void dump(int[][] map) {
		System.err.println("Dump");
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				if (map[i][j] == OCEAN) System.err.print(" O");
				else if (map[i][j] == LAND) System.err.print(" *");
				else if (map[i][j] < 10) System.err.print(" " + map[i][j]);
				else
					System.err.print(map[i][j]);
			}
			System.err.println();
		}

	}

	private static List<Integer> lakeBySize(Map<Integer, Integer> unsortMap) {

		// 1. Convert Map to List of Map
		List<Map.Entry<Integer, Integer>> list = new LinkedList<Map.Entry<Integer, Integer>>(unsortMap.entrySet());

		// 2. Sort list with Collections.sort(), provide a custom Comparator
		// Try switch the o1 o2 position for a different order
		Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
			public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
				return (o1.getValue()).compareTo(o2.getValue());
			}
		});

		// 3. Loop the sorted list and put it into a new insertion order Map
		// LinkedHashMap
		List<Integer> res = new ArrayList<>();
		for (Map.Entry<Integer, Integer> entry : list) {
			res.add(entry.getKey());
		}

		return res;
	}

}