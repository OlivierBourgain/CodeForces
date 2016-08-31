package p71x;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

/**
 */
public class Main710A {
	public static void main(String[] args) {
		run(System.in, System.out);
	}

	public static void run(InputStream in, PrintStream out) {

		try (Scanner sc = new Scanner(in)) {
			String s = sc.nextLine();
			int res = 8;
			if (Arrays.asList("a1", "a8", "h1", "h8").contains(s)) res = 3;
			else if (s.charAt(0) == 'a' || s.charAt(0) == 'h') res = 5;
			else if (s.charAt(1) == '1' || s.charAt(1) == '8') res = 5;
			out.print(res);
		}
	}

}