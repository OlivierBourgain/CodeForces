package p79x;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 */
public class Main796A {
	public static void main(String[] args) {
		run(System.in, System.out);
	}

	public static void run(InputStream in, PrintStream out) {

		try (Scanner sc = new Scanner(in)) {
			int n = sc.nextInt();
			int m = sc.nextInt() - 1;
			int k = sc.nextInt();

			int[] p = new int[n];
			for (int i = 0; i < n; i++) {
				p[i] = sc.nextInt();
			}

			int left = -1;
			int right = -1;
			for (int i = m - 1; i >= 0; i--) {
				if (p[i] > 0 && p[i] <= k) {
					left = i;
					break;
				}
			}

			for (int i = m + 1; i < n; i++) {
				if (p[i] > 0 && p[i] <= k) {
					right = i;
					break;
				}
			}

			if (left == -1) {
				out.print((right - m) * 10);
			} else if (right == -1) {
				out.print((m - left) * 10);

			} else {
				int res = min(right - m, m - left);
				out.print(res * 10);
			}

		}
	}

	public static int min(int a, int b) {
		if (a < b) return a;
		else return b;
	}

}