package p60x;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main600A {
	public static void main(String[] args) {
		// Use the Scanner class
		try (Scanner sc = new Scanner(System.in)) {

			String s = sc.nextLine();

			List<String> t = new ArrayList<String>();

			int prev = -1;
			int idx = 0;
			while (idx < s.length()) {
				if (s.charAt(idx) == ',' || s.charAt(idx) == ';') {
					t.add(s.substring(prev + 1, idx));
					prev = idx;
				}
				idx++;
			}
			t.add(s.substring(prev + 1));

			StringBuilder a = new StringBuilder();
			StringBuilder b = new StringBuilder();
			for (int j = 0; j < t.size(); j++) {
				// System.err.println(t.get(j));
				if (isNumeric(t.get(j))) a.append(',').append(t.get(j));
				else
					b.append(',').append(t.get(j));
			}

			if (a.length() == 0) System.out.println("-");
			else
				System.out.println("\"" + a.substring(1) + "\"");

			if (b.length() == 0) System.out.println("-");
			else
				System.out.println("\"" + b.substring(1) + "\"");
		}
	}

	private static boolean isNumeric(String s) {
		if (s == null || s.length() == 0) return false;
		if (s.charAt(0) == '0' && s.length() == 1) return true;
		if (s.charAt(0) == '0') return false;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) < '0' || s.charAt(i) > '9') return false;
		}
		return true;
	}
}
