package p89x;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 */
public class Main898E {
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
		int ok = 0;

		int[] t = new int[n];
		int zeros = 0;
		for (int i = 0; i < n; i++) {
			int m = in.nextInt();
			if (m == 0) zeros++;
			int sq = (int) Math.sqrt(m);

			if (sq * sq == m) ok++;
			else {
				t[i] = min(m - sq * sq, (sq + 1) * (sq + 1) - m);
			}
		}

		Arrays.sort(t);
		if (ok == n / 2) out.print("0");
		// To few squares.
		else if (ok < n / 2) {
			long res = 0;
			for (int i = ok; i < n / 2; i++)
				res += t[i];
			out.print(res);
		} else {
			// need to make `ok - n / 2` items non square.
			// There are `ok` items square, `zeros` of them being 0

			int k = ok - n / 2;
			if (ok - zeros >= k) out.print(k);
			else out.print(ok - zeros + (k - (ok - zeros)) * 2);
		}
	}

	private static int min(int i, int j) {
		return i < j ? i : j;
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
