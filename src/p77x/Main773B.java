package p77x;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 */
public class Main773B {
	public static void main(String[] args) {
		run(System.in, System.out);
	}

	public static void run(InputStream in, PrintStream out) {

		try (Scanner sc = new Scanner(in)) {
			int n = sc.nextInt();
			int[][] result = new int[n][5];
			int[] solved = new int[5];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < 5; j++) {
					result[i][j] = sc.nextInt();
					if (result[i][j] >= 0) solved[j]++;
				}
			}


			for (int i = 0; i < 10000; i++) {
				int score1 = 0;
				int score2 = 0;
				for (int j = 0; j < 5; j++) {
					int s = solved[j];
					if (result[0][j] > result[1][j] && result[1][j] != -1) s += i;

					// Max point value
					int mpv = maxPointValue(s, n + i);
					if (result[0][j] != -1) score1 += (mpv / 250) * (250 - result[0][j]);
					if (result[1][j] != -1) score2 += (mpv / 250) * (250 - result[1][j]);
				}
				if (score1 > score2) {
					out.print(i);
					return;
				}
			}
			out.print(-1);
		}
	}

	private static int maxPointValue(int s, int n) {
		if (s * 32 <= n) return 3000;
		if (s * 16 <= n) return 2500;
		if (s * 8 <= n) return 2000;
		if (s * 4 <= n) return 1500;
		if (s * 2 <= n) return 1000;
		return 500;
	}

}