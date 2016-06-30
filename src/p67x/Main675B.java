package p67x;

import java.util.Scanner;

public class Main675B {
	public static void main(String[] args) {
		// Use the Scanner class
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int d = sc.nextInt();
			long res = go(n, a, b, c, d);
			System.out.println(res);
		}
	}

	public static long go(int n, int a, int b, int c, int d) {
		long res = 0;
		int xmin = max(1, c + d - a - b + 1);
		int xmax = min(n, c + d - a - b + n);
		for (int x = xmin; x <= xmax; x++) {
			int k = a + b + x;
			int k1 = k - b - d;
			int k2 = k - a - c;
			int k3 = k - c - d;
			if (k1 > 0 && k1 <= n && k2 > 0 && k2 <= n && k3 > 0 && k3 <= n) res++;

		}
		return res * n;
	}

	private static int min(int a, int b) {
		return a > b ? b : a;
	}

	private static int max(int a, int b) {
		return a > b ? a : b;
	}
}