package p76x;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Collections;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 */
public class Main767A {
	public static void main(String[] args) {
		run(System.in, System.out);
	}

	public static void run(InputStream in, PrintStream out) {
		try (Scanner sc = new Scanner(in)) {
			int n = sc.nextInt();
			SortedSet<Integer> s = new TreeSet<Integer>(Collections.reverseOrder());
			int next = n;
			for (int i = 0; i < n; i++) {
				s.add(sc.nextInt());
				StringBuilder line = new StringBuilder();
				while (!s.isEmpty() && s.first() >= next) {
					int k = s.first();

					line.append(k).append(" ");
					s.remove(k);
					next--;
				}
				String t = line.toString();
				if (t.length() == 0) out.println();
				else
					out.println(t.substring(0, line.length()-1));
			}

		}
	}

}