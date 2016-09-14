package p71x;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

/**
 */
public class Main714B {
	public static void main(String[] args) {
		run(System.in, System.out);
	}

	public static void run(InputStream in, PrintStream out) {

		try (Scanner sc = new Scanner(in)) {
			int n = sc.nextInt();

			int a = -1;
			int b = -1;
			int c = -1;
			for (int i = 0; i < n; i++) {
				int j = sc.nextInt();
				if (a == -1) a = j;
				else if (a != j && b == -1) b = j;
				else if (a != j && b != j && c == -1) c = j;

				if (a != j && b != j && c != j) {
					out.print("NO");
					return;
				}

			}

			if (c == -1) {
				out.print("YES");
				return;
			}

			int[] t = new int[3];
			t[0] = a;
			t[1] = b;
			t[2] = c;
			Arrays.sort(t);

			if (t[2] - t[1] == t[1] - t[0]) {
				out.print("YES");
			} else {
				out.print("NO");
			}
		}
	}

}