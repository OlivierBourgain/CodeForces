package p70x;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 */
public class Main703B {
	public static void main(String[] args) {
		run(System.in, System.out);
	}

	public static void run(InputStream in, PrintStream out) {

		try (Scanner sc = new Scanner(in)) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			long res = 0;
			long[] c = new long[n];
			long sum = 0;
			for (int i = 0; i < n; i++) {
				c[i] = sc.nextInt();
				sum += c[i];
				if (i > 0) res += c[i] * c[i - 1];
			}
			res += c[n - 1] * c[0];

			for (int i = 0; i < k; i++) {
				int x = sc.nextInt() - 1;
				sum -= c[x];
				res += c[x] * (sum - c[(x + 1) % n] - c[(x + n - 1) % n]);
				c[x] = 0;
			}
			out.print(res);
		}
	}

}