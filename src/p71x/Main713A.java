package p71x;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 */
public class Main713A {
	public static void main(String[] args) {
		run(System.in, System.out);
	}

	public static class Node {
		Node odd;
		Node even;
		int match = 0;
	}

	public static void run(InputStream in, PrintStream out) {
		Node root = new Node();

		try (Scanner sc = new Scanner(in)) {
			int n = sc.nextInt();
			sc.nextLine();
			for (int i = 0; i < n; i++) {

				String s = sc.nextLine();
				String t = new StringBuilder(s.substring(2)).reverse().toString();
				if (s.isEmpty()) s = "0";
				if (s.startsWith("+")) add(t, root);
				else if (s.startsWith("-")) delete(t, root);
				else
					out.println(match(t, root));
			}

			out.print("");
		}
	}

	private static int match(String t, Node n) {
		if (t.length() == 0 || t.indexOf('1') == -1) {
			if (n.even != null) return n.match + match(t, n.even);
			else return n.match;
		}
		int i = t.charAt(0) - '0';
		if (i % 2 == 0) {
			if (n.even == null) {
				return 0;
			}
			return match(t.substring(1), n.even);
		} else {
			if (n.odd == null) return 0;
			return match(t.substring(1), n.odd);
		}
	}

	private static void delete(String t, Node n) {
		if (t.length() == 0) {
			n.match--;
			return;
		}
		int i = t.charAt(0) - '0';
		if (i % 2 == 0) {
			delete(t.substring(1), n.even);
		} else {
			delete(t.substring(1), n.odd);
		}
	}

	private static void add(String t, Node n) {
		if (t.length() == 0) {
			n.match++;
			return;
		}
		int i = t.charAt(0) - '0';
		if (i % 2 == 0) {
			if (n.even == null) {
				n.even = new Node();
			}
			add(t.substring(1), n.even);
		} else {
			if (n.odd == null) {
				n.odd = new Node();
			}
			add(t.substring(1), n.odd);
		}
	}

}