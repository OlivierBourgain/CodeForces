package p73x;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 */
public class Main731A {
	public static void main(String[] args) {
		run(System.in, System.out);
	}

	public static void run(InputStream in, PrintStream out) {

		try (Scanner sc = new Scanner(in)) {
			String s = sc.nextLine();

			char state = 'a';
			int res = 0;
			for (int i = 0; i < s.length(); i++) {
				char c = s.charAt(i);

				int d = (c - state + 26) % 26;
				int e = (state - c + 26) % 26;
				res += min(d, e);
				state = c;
			}

			out.print(res);
		}
	}

	private static int min(int d, int e) {
		return d < e ? d : e;
	}

}