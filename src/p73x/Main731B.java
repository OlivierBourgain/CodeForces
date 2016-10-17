package p73x;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 */
public class Main731B {
	public static void main(String[] args) {
		run(System.in, System.out);
	}

	public static void run(InputStream in, PrintStream out) {

		try (Scanner sc = new Scanner(in)) {
			int n = sc.nextInt();
			boolean res = true;
			boolean coupon = false;
			for (int i = 0; i < n; i++) {
				int j = sc.nextInt();
				if (coupon) {
					if (j == 0) {
						res = false;
						break;
					}
					if (j % 2 == 1) coupon = false;
				} else {
					if (j % 2 == 1) coupon = true;
				}
			}
			if (coupon) res = false;
			out.print(res ? "YES" : "NO");
		}
	}

}