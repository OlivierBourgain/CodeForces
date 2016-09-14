package p71x;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 */
public class Main714A {
	public static void main(String[] args) {
		run(System.in, System.out);
	}

	public static void run(InputStream in, PrintStream out) {

		try (Scanner sc = new Scanner(in)) {
			long l1 = sc.nextLong();
			long r1 = sc.nextLong();
			long l2 = sc.nextLong();
			long r2 = sc.nextLong();
			long k = sc.nextLong();

			long l = max(l1, l2);
			long r = min(r1, r2);

			long res = r - l + 1;
			if (k >= l && k <= r) res--;
			if (res < 0) res = 0;
			out.print(res);
		}
	}

	public static long min(long a, long b) {
		return a < b ? a : b;
	}

	public static long max(long a, long b) {
		return a > b ? a : b;
	}

}