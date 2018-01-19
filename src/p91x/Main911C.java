package p91x;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 */
public class Main911C {
	public static void main(String[] args) {
		run(System.in, System.out);
	}

	public static void run(InputStream in, PrintStream out) {

		try (Scanner sc = new Scanner(in)) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			if (a == 1 || b == 1 || c == 1) {
				out.print("YES");
				return;
			}
			
			boolean res = check(a, b, c);
			if (!res) res = check(a, c, b);
			if (!res) res = check(b, a, c);
			if (!res) res = check(b, c, a);
			if (!res) res = check(c, a, b);
			if (!res) res = check(c, b, a);

			out.print(res ? "YES" : "NO");
		}
	}

	private static boolean check(int a, int b, int c) {
		if (a==2 && b==2) return true;
		if (a==3 && b==3 && c==3) return true;
		if (a==2 && b==4 && c==4) return true;
		return false;
	}

}