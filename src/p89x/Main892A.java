package p89x;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 */
public class Main892A {
	public static void main(String[] args) {
		run(System.in, System.out);
	}

	public static void run(InputStream in, PrintStream out) {

		try (Scanner sc = new Scanner(in)) {
			int n = sc.nextInt();
			long a = 0;
			for (int i = 0; i < n; i++) {
				a += sc.nextInt();
			}
			long b1 = 0;
			long b2 = 0;
			for (int i = 0; i < n; i++) {
				int b = sc.nextInt();
				if (b > b1 && b > b2) {
					b2 = b1;
					b1 = b;
				} else if (b > b2) {
					b2 = b;
				}
			}

			if (a <= (b1 + b2)) out.print("YES");
			else out.print("NO");

			out.print("");
		}
	}

}