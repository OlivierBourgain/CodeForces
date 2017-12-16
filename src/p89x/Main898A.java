package p89x;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 */
public class Main898A {
	public static void main(String[] args) {
		run(System.in, System.out);
	}

	public static void run(InputStream in, PrintStream out) {

		try (Scanner sc = new Scanner(in)) {
			long n = sc.nextLong();
			if (n % 10 <= 5) out.print(n / 10 * 10);
			else out.print(n / 10 * 10 + 10);
		}
	}

}