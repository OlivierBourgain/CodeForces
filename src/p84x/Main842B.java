package p84x;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 */
public class Main842B {
	public static void main(String[] args) {
		run(System.in, System.out);
	}

	public static void run(InputStream in, PrintStream out) {

		try (Scanner sc = new Scanner(in)) {
			int r = sc.nextInt();
			int d = sc.nextInt();
			int n = sc.nextInt();
			int res = 0;

			for (int i = 0; i < n; i++) {
				int xi = sc.nextInt();
				int yi = sc.nextInt();
				int ri = sc.nextInt();

				double di = Math.sqrt(xi * xi + yi * yi);
				if (di - ri >= r - d && di + ri <= r) res++;

			}

			out.print(res);
		}
	}

}