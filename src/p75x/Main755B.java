package p75x;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 */
public class Main755B {
	public static void main(String[] args) {
		run(System.in, System.out);
	}

	public static void run(InputStream in, PrintStream out) {

		try (Scanner sc = new Scanner(in)) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			sc.nextLine();

			Set<String> p1 = new HashSet<String>();
			Set<String> p2 = new HashSet<String>();
			Set<String> common = new HashSet<String>();
			for (int i = 0; i < n; i++) {
				p1.add(sc.nextLine());
			}
			for (int i = 0; i < m; i++) {
				String s = sc.nextLine();
				if (p1.contains(s)) {
					p1.remove(s);
					common.add(s);
				} else {
					p2.add(s);
				}
			}

			System.err.println(common.size());
			if (common.size() %2 == 0) {
				if (p1.size()> p2.size()) out.print("YES");
				else out.print("NO");
			}
			else {
				if (p1.size()>= p2.size()) out.print("YES");
				else out.print("NO");
			}
		}
	}

}