package p72x;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 */
public class Main727C {
	public static void main(String[] args) {
		run(System.in, System.out);
	}

	public static void run(InputStream in, PrintStream out) {

		try (Scanner sc = new Scanner(in)) {
			int n = sc.nextInt();
			int[] t = new int[n];
			
			// Guess 3 first numbers
			out.println("? 1 2");
			out.flush();
			int a = sc.nextInt();
			out.println("? 1 3");
			out.flush();
			int b = sc.nextInt();
			out.println("? 2 3");
			out.flush();
			int c = sc.nextInt();
			
			t[0] = (a+b-c)/2;
			t[1] = a - t[0];
			t[2] = b - t[0];
			
			for (int i = 3; i < n; i++) {
				out.println("? 1 " + (i+1));
				out.flush();
				int x = sc.nextInt();
				t[i] = x - t[0];
			}

			String res = "!";
			for (int i = 0; i < n; i++) {
				res += " " + t[i];
			}
			out.println(res);
		}
	}

}