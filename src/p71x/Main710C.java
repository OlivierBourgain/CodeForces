package p71x;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 */
public class Main710C {
	public static void main(String[] args) {
		run(System.in, System.out);
	}

	public static void run(InputStream in, PrintStream out) {

		try (Scanner sc = new Scanner(in)) {
			int n = sc.nextInt();
			if (n == 1) {
				out.print(1);
				return;
			}

			int[][] t = new int[n][n];
			int odd = 1;
			int even = 2;

			for (int i = 0; i < n / 2; i++) {
				int k = n / 2 - i;
				for (int j = 0; j < n; j++) {
					if (j < k || j > n - k - 1) {
						t[i][j] = even;
						even += 2;
						t[n - i - 1][j] = even;
						even += 2;
					} else {
						t[i][j] = odd;
						odd += 2;
						t[n - i - 1][j] = odd;
						odd += 2;
					}
				}
			}
			
			for(int i = 0; i<n; i++) {
				t[n/2][i] = odd;
				odd+=2;
			}

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					out.print(t[i][j] + " ");
				}
				out.println();
			}
		}
	}

}