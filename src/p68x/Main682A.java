package p68x;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 */
public class Main682A {
	public static void main(String[] args) {
		run(System.in, System.out);
	}

	public static void run(InputStream in, PrintStream out) {

		try (Scanner sc = new Scanner(in)) {
			int n = sc.nextInt();
			int m = sc.nextInt();

			long res = 0;
			for (int i = 1; i <= n; i++) {
				res += (m + i) / 5 - (i / 5);
				//System.out.println(res);
			}

			out.print(res);
		}
	}

}