package p71x;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 */
public class Main711A {
	public static void main(String[] args) {
		run(System.in, System.out);
	}

	public static void run(InputStream in, PrintStream out) {

		try (Scanner sc = new Scanner(in)) {
			int n = sc.nextInt();
			sc.nextLine();
			boolean placefound = false;
			StringBuilder res =new StringBuilder();
			for (int i = 0; i < n; i++) {
				String s = sc.nextLine();
				if (placefound) res.append(s).append('\n');
				else {
					if (s.startsWith("OO")) {
						placefound = true;
						res.append("++").append(s.substring(2)).append('\n');
					} else if (s.endsWith("OO")) {
						placefound = true;
						res.append(s.substring(0,3)).append("++").append('\n');
					} else {
						res.append(s).append('\n');
					}
				}
				
			}

			if (placefound) {
				out.println("YES");
				out.print(res.toString());
			} else {
				out.print("NO");
			}
		}
	}

}