package p72x;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 */
public class Main723B {
	public static void main(String[] args) {
		run(System.in, System.out);
	}

	public static void run(InputStream in, PrintStream out) {

		try (Scanner sc = new Scanner(in)) {
			sc.nextInt();
			sc.nextLine();
			String s = sc.nextLine();

			int lgword = 0;
			int nbword = 0;
			boolean par = false;

			for (int i = 0; i < s.length(); i++) {
				char c = s.charAt(i);
				if (c == '_') continue;
				else if (c == '(') {
					par = true;
					continue;
				} else if (c == ')') {
					par = false;
					continue;
				} else {
					int size = 0;
					while (i < s.length() && isLetter(s.charAt(i))) {
						i++;
						size++;
					}
					i--;
					if (par) nbword++;
					if (!par && size > lgword) lgword = size;
				}

			}
			out.print(lgword + " " + nbword);
		}
	}

	private static boolean isLetter(char c) {
		if (c == '_' || c == '(' || c == ')') return false;
		else
			return true;
	}

}