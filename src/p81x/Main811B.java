package p81x;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.StringTokenizer;

/**
 */
public class Main811B {
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
		int m = in.nextInt();
		int[] p = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			p[i] = in.nextInt();
		}

		for (int i = 0; i < m; i++) {
			int l = in.nextInt();
			int r = in.nextInt();
			int x = in.nextInt();

			if (x < l || x > r) {
				out.println("Yes");
			} else {
				int cpt = 0;
				for (int j = l; j <= r; j++) {
					if (p[j] < p[x]) cpt++;
				}
				
				if (x == cpt + l) out.println("Yes");
				else out.println("No");
			}
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