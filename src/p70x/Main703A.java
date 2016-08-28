package p70x;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 */
public class Main703A {
	public static void main(String[] args) {
		run(System.in, System.out);
	}

	public static void run(InputStream in, PrintStream out) {

		try (Scanner sc = new Scanner(in)) {
			int n = sc.nextInt();
			int mishka = 0;
			int chris = 0;
			for (int i = 0; i < n; i++) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				if (a>b) mishka++;
				if (b>a) chris++;
			}

			if (mishka == chris) out.print("Friendship is magic!^^");
			else if (mishka>chris) out.print("Mishka");
			else out.print("Chris");
		}
	}

}