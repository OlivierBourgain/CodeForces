package p80x;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 */
public class Main805B {
	public static void main(String[] args) {
		run(System.in, System.out);
	}

	public static void run(InputStream in, PrintStream out) {

		try (Scanner sc = new Scanner(in)) {
			int n = sc.nextInt();
			StringBuilder sb = new StringBuilder(n+4);
			for(int i = 0 ;i<=n/4; i++) sb.append("aabb");

			out.print(sb.substring(0, n).toString());
		}
	}

}