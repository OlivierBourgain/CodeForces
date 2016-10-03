package p72x;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 */
public class Main723C {
	public static void main(String[] args) {
		run(System.in, System.out);
	}

	public static void run(InputStream in, PrintStream out) {

		try (Scanner sc = new Scanner(in)) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int[] a = new int[n];
			int[] b = new int[m + 1];
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
				if (a[i] <= m) b[a[i]]++;
			}

			int min = n / m;

			int nbchanges = 0;
			for (int i = 1; i <= m; i++) {
				if (b[i] < min) nbchanges += min - b[i];
			}

			out.println(min + " " + nbchanges);

			int idxsongtodelete = findnextsonttodelete(a, b, 0, m, min);
			int idxbandtoadd = findnextbandtoadd(b, 1, min);
			while (nbchanges > 0) {
				//System.err.println("Replacing song " + idxsongtodelete + " with band " + idxbandtoadd);
				if (a[idxsongtodelete] <= m) b[a[idxsongtodelete]]--;
				b[idxbandtoadd]++;
				a[idxsongtodelete] = idxbandtoadd;
				nbchanges--;
				idxsongtodelete = findnextsonttodelete(a, b, idxsongtodelete, m, min);
				idxbandtoadd = findnextbandtoadd(b, idxbandtoadd, min);
			}

			out.println(toString(a));

		}
	}

	private static String toString(int[] a) {
		String res = "";
		for (int i = 0; i < a.length; i++) {
			if (i > 0) res += " " + a[i];
			else
				res += a[i];
		}
		return res;
	}

	private static int findnextsonttodelete(int[] a, int[] b, int cur, int m, int min) {
		while (cur < a.length) {
			if (a[cur] > m) return cur;
			if (b[a[cur]] > min) return cur;
			cur++;
		}
		return -1;
	}

	private static int findnextbandtoadd(int[] b, int cur, int min) {
		while (cur < b.length) {
			if (b[cur] < min) return cur;
			cur++;
		}
		return -1;
	}

}