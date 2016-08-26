package p69x;


import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 */
public class Main691A {
	public static void main(String[] args) {
		run(System.in, System.out);
	}

	public static void run(InputStream in, PrintStream out) {

		try (Scanner sc = new Scanner(in)) {
			int n = sc.nextInt();

			int cpt1 = 0;
			int cpt0 = 0;
			for (int i = 0; i < n; i++) {
				int k = sc.nextInt();
				if (k == 0) cpt0++;
				else
					cpt1++;
			}

			if (n == 1) {
				if (cpt1 == 1) out.print("YES");
				else
					out.print("NO");
			} else {
				if (cpt0 == 1) out.print("YES");
				else
					out.print("NO");
			}
		}
	}

}