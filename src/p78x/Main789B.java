package p78x;

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
public class Main789B {
	public static void main(String[] args) {
		FastScanner in = new FastScanner(new BufferedReader(new InputStreamReader(System.in)));
		run(in, System.out);
	}

	public static void runTest(InputStream is, PrintStream out) {
		FastScanner in = new FastScanner(new BufferedReader(new InputStreamReader(is)));
		run(in, out);
	}

	public static void run(FastScanner in, PrintStream out) {
		int b1 = in.nextInt();
		int q = in.nextInt();
		int l = in.nextInt();
		int m = in.nextInt();

		Set<Integer> bad = new HashSet<Integer>(m);
		for (int i = 0; i < m; i++) {
			int v = in.nextInt();
			if (abs(v) <= l)
				bad.add(v);
		}

		if (abs(b1) > l) {
			out.print(0);
			return;
		} else if (b1 == 0) {
			if (bad.contains(0)) {
				out.print(0);
				return;
			}
			out.print("inf");
			return;
		} else if (q == 0) {
			int res = 1;
			if (bad.contains(b1)) {
				res = 0;
			}

			if (bad.contains(0)) {
				out.print(res);
				return;
			}
			out.print("inf");
			return;
		} else if (q == 1) {
			if (bad.contains(b1)) {
				out.print(0);
				return;
			}
			out.print("inf");
			return;
		}  else if (q == -1) {
			if (bad.contains(b1) && bad.contains(-b1)) {
				out.print(0);
				return;
			}
			out.print("inf");
			return;
		}else {

			long val = b1;
			int res = 0;
			while (abs(val) <= l) {
				if (!bad.contains((int) val)) {
					res++;
				}
				val = val * q;
			}
			out.print(res);
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

	public static long abs(long a) {
		if (a < 0)
			return -a;
		else
			return a;
	}

	public static int abs(int a) {
		if (a < 0)
			return -a;
		else
			return a;
	}
}