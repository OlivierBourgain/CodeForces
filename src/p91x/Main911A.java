package p91x;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 */
public class Main911A {
	public static void main(String[] args) {
		run(System.in, System.out);
	}

	public static void run(InputStream in, PrintStream out) {

		try (Scanner sc = new Scanner(in)) {
			int n = sc.nextInt();

			int min = sc.nextInt();
			int last = 0;
			int diff = Integer.MAX_VALUE;
			for (int cur = 1; cur < n; cur++) {
				int i = sc.nextInt();
				if (i < min) {
					min = i;
					last = cur;
					diff = Integer.MAX_VALUE;
				} else if (i == min && cur - last < diff) {
					diff = cur - last;
					last = cur;
				} else if (i == min) {
					last = cur;
				}
			}

			out.print(diff);
		}
	}

}