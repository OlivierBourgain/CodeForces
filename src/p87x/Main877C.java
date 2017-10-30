package p87x;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 */
public class Main877C {
	public static void main(String[] args) {
		run(System.in, System.out);
	}

	public static void run(InputStream in, PrintStream out) {

		try (Scanner sc = new Scanner(in)) {
			int n = sc.nextInt();

			int res = n / 2 * 3;
			if (n % 2 == 1) res++;

			out.println(res);
			StringBuilder sb = new StringBuilder();
			for (int i = 1; i < n; i += 2)
				sb.append(' ').append(i + 1);
			for (int i = 0; i < n; i += 2)
				sb.append(' ').append(i + 1);
			for (int i = 1; i < n; i += 2)
				sb.append(' ').append(i + 1);
			out.print(sb.toString().substring(1));
		}
	}

}