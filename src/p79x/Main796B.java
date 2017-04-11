package p79x;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.StringTokenizer;

/**
 */
public class Main796B {
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
		int m = sc.nextInt();
		int k = sc.nextInt();

		boolean[] hole = new boolean[n + 1]; // 1 based
		for (int i = 0; i < m; i++) {
			hole[sc.nextInt()] = true;
		}

		int pos = 1;
		if (hole[pos]) {
			out.print("1");
			return;
		}
		for(int i = 0; i<k;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if (pos == a) pos = b;
			else if (pos == b) pos = a;
			if (hole[pos]) break;
		}
		out.print(pos);
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