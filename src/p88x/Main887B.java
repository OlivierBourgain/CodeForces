package p88x;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 */
public class Main887B {
	public static void main(String[] args) {
		run(System.in, System.out);
	}

	public static void run(InputStream in, PrintStream out) {

		try (Scanner sc = new Scanner(in)) {
			int n = sc.nextInt();
			int[][] dice = new int[n][6];

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < 6; j++) {
					dice[i][j] = sc.nextInt();
				}
			}

			for (int i = 1; i < 10; i++) {
				boolean check = check(i, dice[0]);
				if (!check && n >= 2) check = check(i, dice[1]);
				if (!check && n == 3) check = check(i, dice[2]);
				if (!check) {
					out.print(i - 1);
					return;
				}
			}

			if (n == 1) {
				out.print(0);
				return;
			}
			for (int i = 10; i < 100; i++) {
				boolean check = check(i / 10, dice[0]) && check(i % 10, dice[1]);
				if (!check) check = check(i / 10, dice[1]) && check(i % 10, dice[0]);
				if (n == 3) {
					if (!check) check = check(i / 10, dice[0]) && check(i % 10, dice[2]);
					if (!check) check = check(i / 10, dice[2]) && check(i % 10, dice[0]);
					if (!check) check = check(i / 10, dice[1]) && check(i % 10, dice[2]);
					if (!check) check = check(i / 10, dice[2]) && check(i % 10, dice[1]);

				}
				if (!check) {
					out.print(i - 1);
					return;
				}
			}
			out.print(0);
		}
	}

	private static boolean check(int n, int[] t) {
		for (int i = 0; i < t.length; i++) {
			if (t[i] == n) return true;
		}
		return false;
	}

}