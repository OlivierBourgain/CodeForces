package p71x;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 */
public class Main711C {
	public static void main(String[] args) {
		run(System.in, System.out);
	}

	public static long INF = 1000000000000000000L;

	public static void run(InputStream in, PrintStream out) {

		try (Scanner sc = new Scanner(in)) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int b = sc.nextInt();
			int[] c = new int[n];
			long[][] p = new long[n][m + 1];

			for (int i = 0; i < n; i++) {
				c[i] = sc.nextInt();
			}
			for (int i = 0; i < n; i++) {
				for (int j = 1; j <= m; j++) {
					p[i][j] = sc.nextInt();
				}
			}

			long[][][] dp = new long[n][b + 1][m + 1];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j <= b; j++) {
					for (int k = 0; k <= m; k++) {
						dp[i][j][k] = INF;
					}
				}
			}

			if (c[0] != 0) {
				dp[0][1][c[0]] = 0;
			} else {
				for (int i = 1; i <= m; i++) {
					dp[0][1][i] = p[0][i];
				}
			}

			// Iteration over tree
			for (int i = 1; i < n; i++) {
				// Iteration over beauty
				for (int j = 1; j <= b; j++) {

					/******************************
					 * Tree is colored
					 *****************************/
					if (c[i] != 0) {
						long min = dp[i - 1][j][c[i]];
						for (int k = 1; k <= m; k++) {
							if (k == c[i]) continue;
							if (dp[i - 1][j - 1][k] < min) min = dp[i - 1][j - 1][k];
						}
						dp[i][j][c[i]] = min;
					}

					/******************************
					 * Tree is not colored
					 *****************************/
					else {
						for (int k = 1; k <= m; k++) {
							long min = INF;
							for (int l = 1; l <= m; l++) {
								if (k == l) {
									if (dp[i - 1][j][l] + p[i][k] < min) min = dp[i - 1][j][l] + p[i][k];
								} else {
									if (dp[i - 1][j - 1][l] + p[i][k] < min) min = dp[i - 1][j - 1][l] + p[i][k];
								}
							}
							dp[i][j][k] = min;
						}
					}
				}
			}

			//dump(dp, n,b,m);
			long res = INF;
			for (int i = 1; i <= m; i++) {
				if (dp[n - 1][b][i] < res) res = dp[n - 1][b][i];
			}
			out.print(res == INF ? -1 : res);
		}
	}

	protected static void dump(int[][][] dp, int n, int b, int m) {
		for (int i = 0; i < n; i++) {
			System.err.println("Tree " + i);
			for (int j = 0; j <= b; j++) {
				System.err.print("Beauty "+j+ "=> [");
				for (int k = 1; k <= m; k++) {
					System.err.print(dp[i][j][k] + ",");
				}
				System.err.print("]    ");
			}
			System.err.println();
		}
	}

}