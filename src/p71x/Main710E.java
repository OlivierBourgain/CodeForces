package p71x;


import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 */
public class Main710E {
	public static void main(String[] args) {
		run(System.in, System.out);
	}

	public static void run(InputStream in, PrintStream out) {

		try (Scanner sc = new Scanner(in)) {
			int n = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();

			long[] dp = new long[n + 1];

			dp[0] = 0;
			dp[1] = x;

			int i = 2;
			while (i <= n) {
				if (i % 2 == 0) {
					dp[i] = min(dp[i - 1] + x, dp[i / 2] + y);
				} else {
					dp[i] = min(dp[i - 1] + x, dp[(i + 1) / 2] + x + y);
				}
				i++;
			}
			out.print(dp[n]);
		}
	}

	private static long min(long i, long j) {
		return i < j ? i : j;
	}

}