package p71x;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Random;
import java.util.StringTokenizer;

/**
 */
public class Main710B {
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
		int[] t = in.readIntArray(n);
		
		// Shuffle the array to avoid TLE. It seems that some of the test cases are partially (or completely) sorted, and make the sort very slow.
		// This idea is copied from a submission from wolfib
		shuffle(t, new Random());
		Arrays.sort(t);
		out.print(t[(n - 1) / 2]);
	}

	   public static int[] shuffle(int[] a, Random gen) {
           for (int i = 0, n = a.length; i < n; i++) {
               int ind = gen.nextInt(n - i) + i;
               int d = a[i];
               a[i] = a[ind];
               a[ind] = d;
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

		public int[] readIntArray(int n) {
			int[] ar = new int[n];
			for (int i = 0; i < n; i++) {
				ar[i] = nextInt();
			}
			return ar;
		}

		public int nextInt() {
			return Integer.parseInt(nextToken());
		}

	}

}