package p71x;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 */
public class Main712C {
	public static void main(String[] args) {
		run(System.in, System.out);
	}

	public static void run(InputStream in, PrintStream out) {

		try (Scanner sc = new Scanner(in)) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int[] l = new int[3];

			l[0] = y;
			l[1] = y;
			l[2] = y;

			int cpt = 0;
			int idx = 0;
			while (true) {
				if (l[0] == l[1] && l[1] == l[2] && l[2] == x) break;
				l[idx] = min(x, l[(idx + 1) % 3] + l[(idx + 2) % 3] - 1);
				cpt++;
				idx = (idx + 1) % 3;
			}
			out.print(cpt);
		}
	}

	public static int min(int a, int b) {
		return a < b ? a : b;
	}

}