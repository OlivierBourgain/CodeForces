package p88x;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 */
public class Main887A {
	public static void main(String[] args) {
		run(System.in, System.out);
	}

	public static void run(InputStream in, PrintStream out) {

		try (Scanner sc = new Scanner(in)) {
			String s = sc.nextLine();

			int idx = s.indexOf('1');
			if (idx <0) {
				out.print("no");
				return;
			}
			int cpt = 0;
			for (int i = idx; i < s.length(); i++) {
				if (s.charAt(i) == '0') cpt++;
			}

			out.print(cpt >= 6 ? "yes" : "no");
		}
	}

}