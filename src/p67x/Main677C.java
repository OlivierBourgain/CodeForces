package p67x;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * Codeforces Round #355 (Div. 2)
 */
public class Main677C {
	public static void main(String[] args) {
		run(System.in, System.out);
	}

	public static void run(InputStream in, PrintStream out) {

		try (Scanner sc = new Scanner(in)) {
			String s = sc.nextLine();
			long n = 1000000007;
			long res = 1;

			for (int i = 0; i < s.length(); i++) {
				char c = s.charAt(i);
				int x = 0;
				if (c >= '0' && c <= '9') x = c - '0';
				else if (c >= 'A' && c <= 'Z') x = c - 'A' + 10;
				else if (c >= 'a' && c <= 'z') x = c - 'a' + 36;
				else if (c == '-') x = 62;
				else
					x = 63;

				int nb0 = 6 - Integer.bitCount(x);
				long k = (long) Math.pow(3, nb0);
				res = (res * k)%n ;
			}
			out.println(res);

		}

	}

}