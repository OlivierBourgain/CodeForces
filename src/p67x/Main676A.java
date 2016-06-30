package p67x;

import java.util.Scanner;

public class Main676A {
	public static void main(String[] args) {
		// Use the Scanner class
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();

			int[] t = new int[n];
			int min = Integer.MAX_VALUE;
			int idxmin = -1;
			int max = Integer.MIN_VALUE;
			int idxmax = -1;

			for (int i = 0; i < n; i++) {
				t[i] = sc.nextInt();
				if (t[i] < min) {
					min = t[i];
					idxmin = i;
				}
				if (t[i] > max) {
					max = t[i];
					idxmax = i;
				}
			}

			int res = 0;
			if (idxmin == 0 || idxmax == 0 || idxmin == n - 1 || idxmax == n - 1) {
				res = n - 1;
			} else {
				if (idxmin > idxmax) {
					int x = idxmin;
					idxmin = idxmax;
					idxmax = x;
				}

				// System.err.println(idxmin + "/"+idxmax);
				if (idxmin <= (n - 1 - idxmax)) res = n - 1 - idxmin;
				else
					res = idxmax;

			}

			System.out.println(res);
		}
	}

}