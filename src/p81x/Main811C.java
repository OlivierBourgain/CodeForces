package p81x;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

/**
 */
public class Main811C {
	public static void main(String[] args) {
		FastScanner in = new FastScanner(new BufferedReader(new InputStreamReader(System.in)));
		run(in, System.out);
	}

	public static void runTest(InputStream is, PrintStream out) {
		FastScanner in = new FastScanner(new BufferedReader(new InputStreamReader(is)));
		run(in, out);
	}

	public static void run(FastScanner in, PrintStream out) {

		int n = in.nextInt();
		int[] a = new int[n];

		int[] first = new int[5001];
		int[] last = new int[5001];
		for (int i = 0; i < 5001; i++) {
			first[i] = -1;
		}

		int max = -1;
		for (int i = 0; i < n; i++) {
			a[i] = in.nextInt();
			if (a[i] > max) max = a[i];
			if (first[a[i]] == -1) {
				first[a[i]] = i;
			}
			last[a[i]] = i;
		}
		// System.err.println(Arrays.toString(a));

		int[] res = new int[n];
		int result = -1;
		if (first[a[0]] == last[a[0]]) res[0] = a[0];

		for (int i = 1; i < n; i++) {
			int firstPos = first[a[i]];
			int lastPos = last[a[i]];

			if (i < lastPos) {
				res[i] = res[i - 1];
			} else if (firstPos == lastPos) {
				res[i] = res[i - 1] + a[i];
			} else {
				int minCity = firstPos;
				int maxCity = lastPos;
				Set<Integer> cities = new HashSet<>();
				int j = i;
				while (j > minCity) {
					cities.add(a[j]);
					minCity = min(minCity, first[a[j]]);
					maxCity = max(maxCity, last[a[j]]);
					j--;
				}

				int v = 0;
				for (Integer city : cities) {
					v = v ^ city;
				}

				// System.err.println("city + " + a[i] + " v = " + v);
				if (maxCity > lastPos) {
					res[i] = res[i - 1];
				} else if (minCity > 0) {
					res[i] = max(v + res[minCity - 1], res[i - 1]);
				} else {
					res[i] = max(v, res[i - 1]);
				}
			}
			if (res[i] > result) result = res[i];

		}
		//System.err.println(Arrays.toString(res));
		out.print(result);
	}

	public static int max(int a, int b) {
		return a > b ? a : b;
	}

	public static int min(int a, int b) {
		return a < b ? a : b;
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