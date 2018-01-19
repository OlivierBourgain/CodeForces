package p91x;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 */
public class Main911B {
	public static void main(String[] args) {
		run(System.in, System.out);
	}

	public static void run(InputStream in, PrintStream out) {

		try (Scanner sc = new Scanner(in)) {
			int n = sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();

			int min = (a + b) / n;
			while (a/min + b/min < n) min--;
			out.print(min(min,min(a,b)));
		}
	}

	private static int min(int a, int b) {
		return a<b?a:b;
	}

}