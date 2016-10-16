package p72x;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 */
public class Main727A {
	public static void main(String[] args) {
		run(System.in, System.out);
	}

	public static void run(InputStream in, PrintStream out) {

		try (Scanner sc = new Scanner(in)) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			List<Integer> l = new ArrayList<>();
			l.add(b);
			List<Integer> res = go(a, b, l);

			if (res == null) {
				out.print("NO");
			} else {
				out.println("YES\n" + res.size());
				for (int i = res.size() - 1; i >= 0; i--) {
					out.print(res.get(i) + " ");
				}
			}
		}
	}

	static List<Integer> go(int a, int b, List<Integer> cur) {
		System.err.println("Doing " + a + "/" + b + " (" + cur + ")");
		if (b < a) return null;
		if (a == b) return cur;
		if (b % 2 == 0) {
			cur.add(b / 2);
			return go(a, b / 2, cur);
		}
		if (b % 10 == 1) {
			cur.add((b - 1) / 10);
			return go(a, (b - 1) / 10, cur);
		}
		return null;
	}

}