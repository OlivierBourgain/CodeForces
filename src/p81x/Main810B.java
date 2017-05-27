package p81x;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

/**
 */
public class Main810B {
	public static void main(String[] args) {
		run(System.in, System.out);
	}

	public static void run(InputStream in, PrintStream out) {

		try (Scanner sc = new Scanner(in)) {
			int n = sc.nextInt();
			int f = sc.nextInt();
			long[] potential = new long[n];
			long sales = 0;
			for (int i = 0; i < n; i++) {
				int stock = sc.nextInt();
				int client = sc.nextInt();

				sales += min(stock, client);
				if (client > stock)
					potential[i] = min(stock, client - stock);
			}

			Arrays.sort(potential);
			
			for(int i = 0; i<f; i++)
				sales += potential[n-1-i];
			out.print(sales);
		}
	}

	private static long min(int a, int b) {
		return a < b ? a : b;
	}

}