package p81x;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 */
public class Main810A {
	public static void main(String[] args) {
		run(System.in, System.out);
	}

	public static void run(InputStream in, PrintStream out) {

		try (Scanner sc = new Scanner(in)) {
			int n = sc.nextInt();
			int k = sc.nextInt();

			int sum = 0;
			for (int i = 0; i < n; i++) {
				sum += sc.nextInt();
			}
			
			
			sum *= 2;

			int target = (2 * k - 1) * n;

			int res = 0;
			while (sum < target) {
				//System.out.println(res + " - " + sum + " - " + target);
				res++;
				target += 2 * k - 1;
				sum += 2 * k;
			}
			out.print(res);
		}
	}

}