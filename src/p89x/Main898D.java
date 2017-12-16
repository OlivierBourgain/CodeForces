package p89x;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.StringTokenizer;

/**
 */
public class Main898D {
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

		int[] a = new int[1000001];
		for (int i = 0; i < n; i++) {
			a[sc.nextInt()]++;
		}

		//dump(a);
		int[] t = new int[1000001];
		int res = 0;
		for (int i = 1; i < t.length; i++) {

			if (i >m) {
				t[i] = max(0, t[i - 1] + a[i] - a[i - m]);
			} else {
				t[i] = max(0, t[i - 1] + a[i]);

			}
			
			if (t[i] >= k) {
				res += t[i] - k + 1;
				a[i] -= t[i] - k + 1;
				t[i] = k - 1;
			}
		}
		//dump(t);

		out.print(res);
	}

	private static int max(int i, int j) {
		return i > j ? i : j;
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