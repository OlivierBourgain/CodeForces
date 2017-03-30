package p78x;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 */
public class Main789A {
	public static void main(String[] args) {
		run(System.in, System.out);
	}

	public static void run(InputStream in, PrintStream out) {

		try (Scanner sc = new Scanner(in)) {
			int n = sc.nextInt();
			int k = sc.nextInt();

			long pocket = 0;
			for (int i = 0; i < n; i++) {
				int l = sc.nextInt();
				pocket += (l + k - 1) / k;
			}

			out.print((pocket + 1) / 2);
		}
	}

}