package p87x;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 */
public class Main876C {
	public static void main(String[] args) {
		run(System.in, System.out);
	}

	public static void run(InputStream in, PrintStream out) {

		try (Scanner sc = new Scanner(in)) {
			int n = sc.nextInt();
			
			int nb = 0;
			StringBuilder res = new StringBuilder();
			
			for(int i = n - 100; i< n; i++) {
				if (sumdigits(i) + i == n) {
					res.append('\n').append(i);
					nb++;
				}
			}
			
			out.print(nb + res.toString());
		}
	}

	public static int sumdigits(int i) {
		int s = 0;
		int n = i;
		while(n > 0) {
			s += n%10;
			n = n/10;
		}
				
		return s;
	}

}