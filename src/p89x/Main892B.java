package p89x;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 */
public class Main892B {
	public static void main(String[] args) {
		run(System.in, System.out);
	}

	public static void run(InputStream in, PrintStream out) {

		try (Scanner sc = new Scanner(in)) {
			int n = sc.nextInt();
			int[] t = new int[n];
			for (int i = 0; i < n; i++) {
				t[i] = sc.nextInt();
			}
			
			int alive = 1;
			int tokill = t[n-1];
			for(int i = n-2; i>=0; i--) {
				if (tokill <= 0) alive++;
				tokill = Math.max(tokill - 1, t[i]);
			}

			out.print(alive);
		}
	}

}