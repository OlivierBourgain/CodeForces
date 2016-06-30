package p67x;

import java.util.Scanner;

public class Main676C {
	public static void main(String[] args) {
		// Use the Scanner class
		try (Scanner sc = new Scanner(System.in)) {
			sc.nextInt(); // We don't use n
			int k = sc.nextInt();
			sc.nextLine();
			String s = sc.nextLine();

			int res = go(k, s);

			System.out.println(res);
		}
	}

	static int go(int k, String s) {
		int[] a = new int[s.length() + 2];
		int[] b = new int[s.length() + 2];
		a[0] = -1;
		b[0] = -1;

		int nba = 0;
		int nbb = 0;
		int acpt = 1;
		int bcpt = 1;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'b') {
				b[bcpt] = i;
				bcpt++;
				nbb++;
			} else {
				a[acpt] = i;
				acpt++;
				nba++;
			}
		}
		a[acpt] = s.length();
		b[bcpt] = s.length();

		if (nba < k) return s.length();
		if (nbb < k) return s.length();
		// System.out.println(Arrays.toString(a));
		// System.out.println(Arrays.toString(b));

		int res = 0;
		for (int i = 0; i < a.length; i++) {
			int j = min(i + k + 1, a.length - 1);
			if (a[j] - a[i] - 1 > res) {
				res = a[j] - a[i] - 1;
			}
			if (b[j] - b[i] - 1 > res) {
				res = b[j] - b[i] - 1;
			}
		}
		return res;
	}

	private static int min(int a, int b) {
		return a < b ? a : b;
	}
}