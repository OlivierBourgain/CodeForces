package p74x;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 */
public class Main745A {
	public static void main(String[] args) {
		run(System.in, System.out);
	}

	public static void run(InputStream in, PrintStream out) {

		try (Scanner sc = new Scanner(in)) {
			String s = sc.nextLine();
			
			Set<String> res = new HashSet<>();

			for (int i = 0; i < s.length(); i++) {
				String t = s.substring(i) + s.substring(0, i);
				res.add(t);
			}
			out.print(res.size());
		}
	}

}