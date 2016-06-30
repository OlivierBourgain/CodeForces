package p67x;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * Codeforces Round #355 (Div. 2)
 */
public class Main677A {
	public static void main(String[] args) {
		run(System.in, System.out);
	}

	public static void run(InputStream in, PrintStream out) {

		try (Scanner sc = new Scanner(in)) {
			int n = sc.nextInt();
			int h = sc.nextInt();

			long res = 0;
			for (int i = 0; i < n; i++) {
				int a = sc.nextInt();
				res += a > h ? 2 : 1;

			}
			
			out.println(res);
		}

	}

}