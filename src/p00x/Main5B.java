package p00x;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 */
public class Main5B {
	public static void main(String[] args) {
		run(System.in, System.out);
	}

	public static void run(InputStream in, PrintStream out) {
		try (Scanner sc = new Scanner(in)) {
			List<String> list = new ArrayList<>();
			int l = -1;
			while (sc.hasNextLine()) {
				String s = sc.nextLine();
				list.add(s);
				if (s.length() > l) l = s.length();
			}
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < l + 2; i++)
				sb.append('*');
			sb.append('\n');

			boolean odd = false;
			for (String s : list) {
				int k = l - s.length();
				int kleft = k/2;
				int kright = k - k/2;
				if (odd && kleft < kright) {
					int x = kright;
					kright = kleft;
					kleft = x;
				}
				if (!odd && kleft > kright) {
					int x = kright;
					kright = kleft;
					kleft = x;
				}
				
				if (kleft != kright) odd = !odd;

				sb.append('*');
				for (int j = 0; j < kleft; j++) sb.append(' ');
				sb.append(s);
				for (int j = 0; j < kright; j++) sb.append(' ');
				sb.append('*');
				sb.append('\n');
			}
			for (int i = 0; i < l + 2; i++)
				sb.append('*');
			sb.append('\n');

			out.print(sb.toString());
		}
	}

}