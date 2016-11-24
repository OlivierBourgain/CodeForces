package p72x;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 */
public class Main725C {
	public static void main(String[] args) {
		run(System.in, System.out);
	}

	public static void run(InputStream in, PrintStream out) {

		try (Scanner sc = new Scanner(in)) {
			String s = sc.nextLine();

			boolean[] cars = new boolean[26];
			char car = '\u0000';

			for (int i = 0; i < s.length(); i++) {
				char c = s.charAt(i);
				if (cars[c - 'A']) car = c;
				cars[c - 'A'] = true;
			}
			int pos1 = 0;
			while (s.charAt(pos1) != car)
				pos1++;
			int pos2 = pos1 + 1;
			while (s.charAt(pos2) != car)
				pos2++;

			// System.err.println("Duplicate is " + car + " at " + pos1 + " & "
			// + pos2);

			if (pos2 == pos1 + 1) {
				out.print("Impossible");
				return;
			}

			int diff = pos2 - pos1;

			char[] l1 = new char[13];
			char[] l2 = new char[13];
			String s2 = new StringBuilder(s).deleteCharAt(pos2).toString();

			int start = 13 - (diff / 2) - 1;
			if (diff % 2 == 0) start = 13 - (diff / 2);

			// System.err.println("Starting at idx " + start);
			int c = pos1;
			int idx = start;
			while (idx < 13) {
				l1[idx] = s2.charAt(c);
				idx++;
				c = incr(c);
			}
			for (int i = 12; i >= 0; i--) {
				l2[i] = s2.charAt(c);
				c = incr(c);
			}
			for (int i = 0; i < start; i++) {
				l1[i] = s2.charAt(c);
				c = incr(c);
			}

			String t = "";
			for (int i = 0; i < 13; i++)
				t += l1[i];
			t += "\n";
			for (int i = 0; i < 13; i++)
				t += l2[i];
			// System.err.println(s);
			// System.err.println("-->");
			// System.err.println(t);
			out.print(t);
		}
	}

	private static int incr(int i) {
		return i == 25 ? 0 : i + 1;
	}

}