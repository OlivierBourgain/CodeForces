package p81x;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

/**
 */
public class Main816C {
	public static void main(String[] args) {
		run(System.in, System.out);
	}

	public static void run(InputStream in, PrintStream out) {

		try (Scanner sc = new Scanner(in)) {
			int n = sc.nextInt();
			int m = sc.nextInt();

			int[][] tab = new int[n][m];
			int[] row = new int[n];
			int[] col = new int[m];
			for (int i = 0; i < n; i++)
				row[i] = Integer.MAX_VALUE;
			for (int i = 0; i < m; i++)
				col[i] = Integer.MAX_VALUE;

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					int k = sc.nextInt();
					tab[i][j] = k;
					if (k < row[i])
						row[i] = k;
					if (k < col[j])
						col[j] = k;
				}
			}

			System.err.println(Arrays.toString(row));
			System.err.println(Arrays.toString(col));
			int cpt = 0;
			StringBuilder res = new StringBuilder();

			if (n < m) {
				for (int i = 0; i < n; i++) {
					cpt += row[i];
					for (int k = 0; k < row[i]; k++) {
						res.append("row ").append(i + 1).append('\n');
					}
				}
				for (int j = 0; j < m; j++) {
					for (int i = 1; i < n; i++) {
						if (tab[i][j] - row[i] != tab[0][j] - row[0]) {
							out.print("-1");
							return;
						}
					}
					cpt += tab[0][j] - row[0];
					for (int k = 0; k < tab[0][j] - row[0]; k++) {
						res.append("col ").append(j + 1).append('\n');
					}
				}
			} else {
				for (int j = 0; j < m; j++) {
					cpt += col[j];
					for (int k = 0; k < col[j]; k++) {
						res.append("col ").append(j + 1).append('\n');
					}
				}
				for (int i = 0; i < n; i++) {
					for (int j = 1; j < m; j++) {
						if (tab[i][j] - col[j] != tab[i][0] - col[0]) {
							out.print("-1");
							return;
						}
					}
					cpt += tab[i][0] - col[0];
					for (int k = 0; k < tab[i][0] - col[0]; k++) {
						res.append("row ").append(i + 1).append('\n');
					}
				}
			}

			out.print(cpt + "\n" + res.toString());
		}
	}

}