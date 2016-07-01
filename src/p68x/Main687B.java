package p68x;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.StringTokenizer;

/**
 */
public class Main687B {
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
			int k = in.nextInt();
			long lcm = 1;
			

			for (int i = 0; i < n; i++) {
				int ci = in.nextInt();
				lcm = lcm * ci / gcd(lcm, ci);
	        	if(lcm > 1E11)
	        		lcm = gcd(lcm,k);
			}
			if (lcm % k == 0) {
				out.print("Yes");
				return;
			}
			out.print("No");
	}

	private static long gcd(long a, long b) {
		if (a < b) return gcd(b, a);
        while (b != 0) {
            long r = a % b;
            a = b;
            b = r;
        }
        return a;
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