package p81x;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.StringTokenizer;

/**
 */
public class Main816B {
	public static void main(String[] args) {
		FastScanner in = new FastScanner(new BufferedReader(new InputStreamReader(System.in)));
		run(in, System.out);
	}

	public static void runTest(InputStream is, PrintStream out) {
		FastScanner in = new FastScanner(new BufferedReader(new InputStreamReader(is)));
		run(in, out);
	}

	public static void run(FastScanner sc, PrintStream out) {

		int n = sc.nextInt();
		int k = sc.nextInt();
		int q = sc.nextInt();
		int nbTemp = 200000;
		int[] t = new int[nbTemp + 2];
		for (int i = 0; i < n; i++) {
			int l = sc.nextInt();
			int r = sc.nextInt();
			t[l]++;
			t[r + 1]--;
		}

		// Sum t from left to right = Number of recipe per temperature
		for (int i = 1; i <= nbTemp; i++) {
			t[i] += t[i - 1];
		}

		// Keep only temp with > k recipe
		for (int i = 1; i <= nbTemp; i++) {
			if (t[i] >= k)
				t[i] = 1;
			else
				t[i] = 0;
		}
		
		// Sum t again from left to right = cumulative number of valid recipe
		for (int i = 1; i <= nbTemp; i++) {
			t[i] += t[i - 1];
		}

		StringBuilder res = new StringBuilder();
		for (int i = 0; i < q; i++) {
			int l = sc.nextInt();
			int r = sc.nextInt();
			res.append(t[r] - t[l - 1]).append('\n');

		}
		out.print(res);
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