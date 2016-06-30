package p50x;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 */
public class Main501B {
	public static void main(String[] args) {
		run(System.in, System.out);
	}

	public static void run(InputStream in, PrintStream out) {
		try (Scanner sc = new Scanner(in)) {
			int n = sc.nextInt();
			Map<String, String> finalmap = new HashMap<>();
			Map<String, String> inverse = new HashMap<>();
			sc.nextLine();
			for (int i = 0; i < n; i++) {
				String s = sc.nextLine();
				String[] t = s.split(" ");
				String old = t[0];
				String nw = t[1];

				if (inverse.containsKey(old)) {
					String root = inverse.get(old);
					finalmap.put(root, nw);
					inverse.put(nw, root);
				} else {
					finalmap.put(old, nw);
					inverse.put(nw, old);
				}

			}

			out.println(finalmap.size());
			for (String s : finalmap.keySet()) {
				out.println(s + " " + finalmap.get(s));
			}
		}
	}

}