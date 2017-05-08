package p80x;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 */
public class Main807A {
	public static void main(String[] args) {
		run(System.in, System.out);
	}

	public static void run(InputStream in, PrintStream out) {

		try (Scanner sc = new Scanner(in)) {
			int n = sc.nextInt();
			int min = Integer.MAX_VALUE;
			boolean rated = false;
			boolean ordered = true;
			for (int i = 0; i < n; i++) {
				int before = sc.nextInt();
				int after = sc.nextInt();

				if (before != after) rated = true;
				else if (after > min) ordered = false;
				min = after;
			}

			if (rated) out.print("rated");
			else if (!ordered) out.print("unrated");
			else out.print("maybe");

		}
	}

	public static int min(int a, int b) {
		return a < b ? a : b;
	}
}