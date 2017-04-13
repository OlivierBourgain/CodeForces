package p79x;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

/**
 */
public class Main796D {
	public static void main(String[] args) {
		FastScanner in = new FastScanner(new BufferedReader(new InputStreamReader(System.in)));
		run(in, System.out);
	}

	public static void runTest(InputStream is, PrintStream out) {
		FastScanner in = new FastScanner(new BufferedReader(new InputStreamReader(is)));
		run(in, out);
	}

	public static class City {
		int idx;
		int dist = -1;
		boolean police;
		boolean visited;
		List<Road> road = new ArrayList<>();

		public City(int idx) {
			this.idx = idx;
		}
	}

	public static class Road {
		int from;
		int to;
		int idx;
		boolean visited = false;

		public Road(int idx, int from, int to) {
			this.idx = idx;
			this.from = from;
			this.to = to;
		}
	}

	public static void run(FastScanner sc, PrintStream out) {

		int n = sc.nextInt();
		int k = sc.nextInt();
		int d = sc.nextInt();

		List<City> cities = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			cities.add(new City(i));
		}

		Deque<City> queue = new LinkedList<>();

		for (int i = 0; i < k; i++) {
			int p = sc.nextInt() - 1;
			cities.get(p).police = true;
			cities.get(p).dist = 0;
			cities.get(p).visited = true;
			queue.addLast(cities.get(p));
		}

		for (int i = 0; i < n - 1; i++) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			Road r = new Road(i+1, a, b);
			cities.get(a).road.add(r);
			cities.get(b).road.add(r);
		}

		List<Integer> res = new ArrayList<>();

		while (!queue.isEmpty()) {
			City c = queue.removeFirst();
			//System.err.println("Doing city " + c.idx);
			for (Road r : c.road) {
				City t = cities.get(r.from);
				if (t.idx == c.idx) t = cities.get(r.to);
				if (r.visited) {
					// Nothing to do
				}else if (t.visited) {
					//System.err.println("--> Deleting " + r.idx + " from " + r.from + " to " + r.to);
					res.add(r.idx);
				} else if (t.dist < d) {
					t.dist = c.dist + 1;
					t.visited = true;
					queue.add(t);
				}
				r.visited = true;
			}
		}

		out.println(res.size());
		if (res.size()>0) {
		StringBuilder sb = new StringBuilder();
		for (Integer i : res)
			sb.append(" ").append(i);
		out.print(sb.toString().substring(1));
		}
	}

	static class FastScanner {
		BufferedReader in;
		StringTokenizer st;

		public FastScanner(BufferedReader in) {
			this.in = in;
		}

		public String nextToken() {
			while (st == null || !st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(in.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		public int nextInt() {
			return Integer.parseInt(nextToken());
		}

		public long nextLong() {
			return Long.parseLong(nextToken());
		}

		public double nextDouble() {
			return Double.parseDouble(nextToken());
		}
	}

}