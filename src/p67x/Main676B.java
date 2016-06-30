package p67x;

import java.util.Scanner;

public class Main676B {
	public static void main(String[] args) {
		// Use the Scanner class
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int q = sc.nextInt();

			// Cas particuliers
			if (q == 0) {
				System.out.println(0);
				return;
			}
			if (n == 1) {
				System.out.println(1);
				return;
			}

			// Cas général
			// n >= 2
			// q >= 1
			double[][] t = new double[n][n];
			int cpt = 0;

			t[0][0] = q;
			for (int i = 1; i < n; i++) {
				for (int j = 0; j < i; j++) {
					if (t[i - 1][j] >= 1) cpt++;
					if (t[i - 1][j] > 1) {
						double split = (t[i - 1][j] - 1) / 2f;
						t[i][j] += split;
						t[i][j + 1] += split;
					}
				}
				// System.out.println("Step " + i);
				// dump(t);
			}
			for (int i = 0; i < n; i++) {
				if (t[n - 1][i] >= 1) cpt++;
			}
			System.out.println(cpt);
		}
	}

}