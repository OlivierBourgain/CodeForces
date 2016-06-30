package p00x;
import java.util.Scanner;

public class Main001B {
	public static void main(String[] args) {
		// Use the Scanner class
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < n; i++) {
			String s = sc.nextLine();
			System.out.println(go(s));
		}
		sc.close();
	}

	/*
	 * R23C55
	 * BC23
	 */
	static String go(String s) {
		// First letters
		int ridx = s.indexOf('R');
		int cidx = s.indexOf('C');

		if (ridx == 0 && cidx > 0 && s.charAt(1) >= '0' && s.charAt(1) <= '9') {
			// R1C1 -> A1
			String r = s.substring(1, cidx);
			String c = s.substring(cidx + 1);

			return toAlpha(Integer.parseInt(c)) + r;
		}

		// A1 -> R1C1
		int i = 0;
		while (s.charAt(i) >= 'A')
			i++;
		// System.out.println(i);
		return "R" + s.substring(i) + "C" + toInt(s.substring(0, i));

	}

	private static int toInt(String s) {
		int res = 0;
		for (int i = 0; i < s.length(); i++) {
			res = res * 26 + (s.charAt(i) - 'A' + 1);
		}
		return res;
	}

	private static String toAlpha(int n) {
		String res = "";
		int i = n;
		while (i > 0) {
			char c = (char) ('A' + ((i - 1) % 26));
			res = c + res;
			i = (i - 1) / 26;
		}
		return res;
	}

}