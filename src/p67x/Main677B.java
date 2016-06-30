package p67x;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * Codeforces Round #355 (Div. 2)
 */
public class Main677B {
	public static void main(String[] args) {
		run(System.in, System.out);
	}

	public static void run(InputStream in, PrintStream out) {

		try (Scanner sc = new Scanner(in)) {
			int n = sc.nextInt();
			int h = sc.nextInt();
			int k = sc.nextInt();

			long res = 0;
			int carry = 0;
			
			
			for (int i = 0; i < n; i++) {
				int a = sc.nextInt();
				if (carry + a > h) {
					res++;
					carry = 0;
				}
				res += (a + carry) / k;
				carry = (a + carry) % k;

			}

			if (carry > 0) res++;

			out.println(res);
		}

	}

}