package p72x;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

/**
 */
public class Main723A {
	public static void main(String[] args) {
		run(System.in, System.out);
	}

	public static void run(InputStream in, PrintStream out) {

		try (Scanner sc = new Scanner(in)) {
			int[] t = new int[3];
			t[0] = sc.nextInt();
			t[1]= sc.nextInt();
			t[2] = sc.nextInt();
			Arrays.sort(t);
			
			int res = t[2] - t[0];

			out.print(res);
		}
	}

}