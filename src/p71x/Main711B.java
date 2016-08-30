package p71x;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 */
public class Main711B {
	public static void main(String[] args) {
		run(System.in, System.out);
	}

	public static void run(InputStream in, PrintStream out) {

		try (Scanner sc = new Scanner(in)) {
			int n = sc.nextInt();
			long[][] t = new long[n][n];
			long[] r = new long[n];
			long[] c = new long[n];

			int x = -1;
			int y = -1;
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					int a = sc.nextInt();
					t[i][j] = a;
					r[i] += a;
					c[j] += a;
					if (a == 0) {
						x = i;
						y = j;
					}
				}
			}

			if (n == 1) {
				out.print("1");
				return;
			}

			// Compute value for t[x][y];
			t[x][y] = r[(x + 1) % n] - r[x];

			if (t[x][y] <= 0) {
				out.print(-1);
				return;
			}

			r[x] += t[x][y];
			c[y] += t[x][y];

			if (checkMagic(t, r, c)) out.print(t[x][y]);
			else
				out.print(-1);

		}
	}

	private static boolean checkMagic(long[][] t, long[] r, long[] c) {
		long l = r[0];
		for (int i = 0; i < t.length; i++) {
			if (r[i] != l) return false;
			if (c[i] != l) return false;
		}

		// Check diags
		long d1 = 0;
		long d2 = 0;
		for (int i = 0; i < t.length; i++) {
			d1 += t[i][i];
			d2 += t[i][t.length - 1 - i];
		}

		if (d1 != l) return false;
		if (d2 != l) return false;
		return true;
	}

}