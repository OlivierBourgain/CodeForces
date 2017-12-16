package p84x;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 */
public class Main842A {
	public static void main(String[] args) {
		run(System.in, System.out);
	}

	public static void run(InputStream in, PrintStream out) {

		try (Scanner sc = new Scanner(in)) {
			long l = sc.nextInt();
			long r = sc.nextInt();
			long x = sc.nextInt();
			long y = sc.nextInt();
			long k = sc.nextInt();

			for (long b = x; b <= y; b++) {
				long c = k * b;
				if (c >= l && c <= r) {
					out.print("YES");
					return;
				}
			}
			
			out.print("NO");
		}
	}

}