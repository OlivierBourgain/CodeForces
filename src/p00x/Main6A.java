package p00x;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 */
public class Main6A {
	public static void main(String[] args) {
		run(System.in, System.out);
	}

	public static void run(InputStream in, PrintStream out) {

		/**
		 * Lignes de textes
		 */
		try (Scanner sc = new Scanner(in)) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int d = sc.nextInt();

			boolean triangle = false;
			triangle |= tr(a, b, c);
			triangle |= tr(a, b, d);
			triangle |= tr(a, c, d);
			triangle |= tr(b, c, d);

			if (triangle) {
				out.print("TRIANGLE");
				return;
			}

			boolean segment = false;
			segment |= sg(a, b, c);
			segment |= sg(a, b, d);
			segment |= sg(a, c, d);
			segment |= sg(b, c, d);

			if (segment) out.print("SEGMENT");
			else
				out.print("IMPOSSIBLE");
		}

	}

	private static boolean sg(int a, int b, int c) {
		if (a + b == c) return true;
		if (a + c == b) return true;
		if (b + c == a) return true;
		return false;
	}

	private static boolean tr(int a, int b, int c) {
		if (a <= c && b <= c && a + b > c) return true;
		if (a <= b && c <= b && a + c > b) return true;
		if (b <= a && c <= a && b + c > a) return true;
		return false;
	}

}