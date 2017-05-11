package p77x;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 */
public class Main773A {
	public static void main(String[] args) {
		run(System.in, System.out);
	}

	public static void run(InputStream in, PrintStream out) {

		try (Scanner sc = new Scanner(in)) {
			int n = sc.nextInt();
			for (int i = 0; i < n; i++) {
				long x = sc.nextLong();
				long y = sc.nextLong();
				long p = sc.nextLong();
				long q = sc.nextLong();
				out.println(go(x, y, p, q));

			}

		}
	}

	private static long go(long x, long y, long p, long q) {
		System.err.println("Doing " + x + "/" + y + "/" + p + "/" + q);
		if (p == q) {
			if (x < y) return -1;
			else if (x == 0) return 1;
			else return 0;
		}
		if (p == 0) {
			if (x == 0) return 0;
			else return -1;
		}

		if (x * q == p * y) return 0;

		long min = 0;
		long max = (int) 1e9;
		
		while (min < max) {
			long n = (min + max) / 2;
			if (q * n < y ||  p * n < x) {
				min = n + 1;
				continue;
			}
			long a = p * n - x;
			long b = q * n - y;
			if (a <= b) max = n;
			else min = n + 1;
		}
		return q * min - y;

	}

}