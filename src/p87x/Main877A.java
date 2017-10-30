package p87x;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 */
public class Main877A {
	public static void main(String[] args) {
		run(System.in, System.out);
	}

	public static void run(InputStream in, PrintStream out) {

		try (Scanner sc = new Scanner(in)) {
			String s = sc.nextLine();

			String res = go(s);

			out.print(res);
		}
	}

	private static String go(String s) {
		int danil = s.indexOf("Danil", 0);
		int danilLast = s.lastIndexOf("Danil", s.length());
		if (danil >= 0 && danil != danilLast) return "NO";

		int olya = s.indexOf("Olya", 0);
		int olyaLast = s.lastIndexOf("Olya", s.length());
		if (olya >= 0 && olya != olyaLast) return "NO";

		int slava = s.indexOf("Slava", 0);
		int slavaLast = s.lastIndexOf("Slava", s.length());
		if (slava >= 0 && slava != slavaLast) return "NO";

		int ann = s.indexOf("Ann", 0);
		int annLast = s.lastIndexOf("Ann", s.length());
		if (ann >= 0 && ann != annLast) return "NO";

		int nikita = s.indexOf("Nikita", 0);
		int nikitaLast = s.lastIndexOf("Nikita", s.length());
		if (nikita >= 0 && nikita != nikitaLast) return "NO";

		int nb = (danil >= 0 ? 1 : 0);
		nb += olya >= 0 ? 1 : 0;
		nb += slava >= 0 ? 1 : 0;
		nb += ann >= 0 ? 1 : 0;
		nb += nikita >= 0 ? 1 : 0;
		return nb == 1 ? "YES": "NO";
	}

}