package p69x;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 */
public class Main691B {
	public static void main(String[] args) {
		run(System.in, System.out);
	}

	static String maj = "A******HI***M*O****TUVWXY*";
	static String min = "*d*b**********oqp****vwx**";

	public static void run(InputStream in, PrintStream out) {

		try (Scanner sc = new Scanner(in)) {
			String s = sc.nextLine();
			String res = go(s);

			out.print(res);
		}
	}

	private static String go(String s) {
		int n = s.length();

		for (int i = 0; i < (n + 1) / 2; i++) {
			char c = s.charAt(i);
			char d = s.charAt(n - 1 - i);

			if (c >= 'a' && c <= 'z' && min.charAt(c - 'a') != d) return "NIE";
			else if (c >= 'A' && c <= 'Z' && maj.charAt(c - 'A') != d) return "NIE";

		}
		return "TAK";
	}

}