package p79x;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 */
public class Main799A {
	public static void main(String[] args) {
		run(System.in, System.out);
	}

	public static void run(InputStream in, PrintStream out) {

		try (Scanner sc = new Scanner(in)) {
			int n = sc.nextInt(); // Number of cake needed
			int t = sc.nextInt(); // Time for one oven to bake k cakes
			int k = sc.nextInt(); // Number of cakes baked at the same time
			int d = sc.nextInt(); // time needed to build the second oven

			// Nb of cakes baked before the second oven is built
			int a = (d / t) * k;
			
			if (n-a <= k) out.print("NO");
			else out.print("YES");

		}
	}

	public static int min(int a, int b) {
		return a < b ? a : b;
	}

}