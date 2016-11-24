package p72x;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 */
public class Main725A {
	public static void main(String[] args) {
		run(System.in, System.out);
	}

	public static void run(InputStream in, PrintStream out) {

		try (Scanner sc = new Scanner(in)) {
			sc.nextLine();
			String s = sc.nextLine();

			int res = 0;
			int idx = 0;
			while (idx < s.length() && s.charAt(idx) == '<') {
				idx++;
				res++;
			}
			
			idx = s.length() - 1;
			while (idx >= 0 && s.charAt(idx) == '>') {
				idx--;
				res++;
			}
			out.print(res);
		}
	}

}