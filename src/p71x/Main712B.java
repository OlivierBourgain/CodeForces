package p71x;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 */
public class Main712B {
	public static void main(String[] args) {
		run(System.in, System.out);
	}

	public static void run(InputStream in, PrintStream out) {

		try (Scanner sc = new Scanner(in)) {
			String s = sc.nextLine();
			if (s.length() % 2 == 1) {
				out.print(-1);
				return;
			}
			int x = 0;
			int y = 0;
			for (Character c : s.toCharArray()) {
				switch (c) {
				case 'U':
					y++;
					break;
				case 'D':
					y--;
					break;
				case 'R':
					x++;
					break;
				case 'L':
					x--;
					break;
				}
			}

			int res = (abs(x) + abs(y)) / 2;
			out.print(res);

		}
	}

	public static int abs(int a) {
		return a < 0 ? -a : a;
	}

}