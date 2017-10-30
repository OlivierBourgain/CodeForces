package p87x;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.StringTokenizer;

/**
 */
public class Main876D {

	public static void run(FastScanner sc, PrintStream out) {
		int n = sc.nextInt();
		boolean[] t = new boolean[n];
		int last = n - 1;

		out.print('1');
		for (int i = 0; i < n; i++) {
			int pos = sc.nextInt();
			t[pos - 1] = true;

			while (last >= 0 && t[last])
				last--;

			int val = 1 + (i + 1) - (n - (last + 1));
			out.print(" " + val);
		}
	}


	
	public static void main(String[] args) {
		FastScanner in = new FastScanner(new BufferedReader(new InputStreamReader(System.in)));
		run(in, System.out);
	}

	public static void runTest(InputStream is, PrintStream out) {
		FastScanner in = new FastScanner(new BufferedReader(new InputStreamReader(is)));
		run(in, out);
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