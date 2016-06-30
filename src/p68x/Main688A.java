package p68x;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 */
public class Main688A {
	public static void main(String[] args) {
		run(System.in, System.out);
	}

	public static void run(InputStream in, PrintStream out) {

		try (Scanner sc = new Scanner(in)) {
			sc.nextInt();
			int d = sc.nextInt();
			sc.nextLine();

			int max = 0;
			int cur = 0;
			for (int i = 0; i < d; i++) {
				String s = sc.nextLine();
				if (s.contains("0")) {
					cur++;
				} else {
					if (cur > max) max = cur;
					cur = 0;
				}
			}
			if (cur > max) max = cur;

			out.print(max);
		}
	}

}