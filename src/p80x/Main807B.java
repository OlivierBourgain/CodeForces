package p80x;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 */
public class Main807B {
	public static void main(String[] args) {
		run(System.in, System.out);
	}

	public static void run(InputStream in, PrintStream out) {

		try (Scanner sc = new Scanner(in)) {
			int p = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();

			for (int l = x; l >= y; l -= 50) {
				int i = (l / 50) % 475;
				for (int k = 0; k < 25; k++) {
					i = (i * 96 + 42) % 475;

					if ((i + 26) == p) {
						out.print("0");
						return;
					}
				}

			}

			for (int l = x + 50;; l += 50) {
				if (l < y) continue;

				int i = (l / 50) % 475;
				for (int k = 0; k < 25; k++) {
					i = (i * 96 + 42) % 475;
					if ((i + 26) == p) {
						out.print((l + 50 - x) / 100);
						return;
					}
				}

			}

		}
	}

}