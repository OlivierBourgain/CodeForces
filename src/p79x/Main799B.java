package p79x;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

/**
 */
public class Main799B {
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
		Integer[][] t = new Integer[n][3];
		for (int i = 0; i < n; i++) {
			t[i][0] = in.nextInt();
		}
		for (int i = 0; i < n; i++) {
			t[i][1] = in.nextInt();
		}
		for (int i = 0; i < n; i++) {
			t[i][2] = in.nextInt();
		}

		Arrays.sort(t, new Comparator<Integer[]>() {
			@Override
			public int compare(final Integer[] entry1, final Integer[] entry2) {
				return entry1[0] - entry2[0];
			}
		});

		int[][] c1 = new int[n][2];
		int[][] c2 = new int[n][2];
		int[][] c3 = new int[n][2];
		int i1 = 0;
		int i2 = 0;
		int i3 = 0;
		for (int i = 0; i < n; i++) {
			if (t[i][1] == 1 || t[i][2] == 1) {
				c1[i1][0] = i;
				c1[i1++][1] = t[i][0];
			}
			if (t[i][1] == 2 || t[i][2] == 2) {
				c2[i2][0] = i;
				c2[i2++][1] = t[i][0];
			}
			if (t[i][1] == 3 || t[i][2] == 3) {
				c3[i3][0] = i;
				c3[i3++][1] = t[i][0];
			}
		}
		System.err.println(Arrays.deepToString(c1));
		System.err.println(Arrays.deepToString(c2));
		System.err.println(Arrays.deepToString(c3));
		boolean[] bought = new boolean[n];
		int m = in.nextInt();

		i1 = 0;
		i2 = 0;
		i3 = 0;

		StringBuilder res = new StringBuilder();
		for (int i = 0; i < m; i++) {
			int c = in.nextInt();
			if (c == 1) {
				while (i1 < n && bought[c1[i1][0]])
					i1++;
				if (i1 < n && c1[i1][1] > 0) {
					res.append(' ').append(c1[i1][1]);
					bought[c1[i1][0]] = true;
					i1++;
				} else {
					res.append(" -1");

				}
			} else if (c == 2) {
				while (i2 < n && bought[c2[i2][0]])
					i2++;
				if (i2 < n && c2[i2][1] > 0) {
					res.append(' ').append(c2[i2][1]);
					bought[c2[i2][0]] = true;
					i2++;
				} else {
					res.append(" -1");

				}
			} else if (c == 3) {
				while (i3 < n && bought[c3[i3][0]])
					i3++;
				if (i3 < n && c3[i3][1] > 0) {
					res.append(' ').append(c3[i3][1]);
					bought[c3[i3][0]] = true;
					i3++;
				} else {
					res.append(" -1");

				}
			}

		}

		out.print(res.toString().substring(1));
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
