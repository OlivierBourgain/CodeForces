package p00x;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 */
public class Main6B {
	public static void main(String[] args) {
		run(System.in, System.out);
	}

	public static void run(InputStream in, PrintStream out) {

		/**
		 * N
		 * + n lignes de texte
		 */
		try (Scanner sc = new Scanner(in)) {
			String s = sc.nextLine();
			String[] t = s.split(" ");
			int n = Integer.parseInt(t[0]);
			int m = Integer.parseInt(t[1]);
			char p = t[2].charAt(0);

			char[][] tab = new char[n][m];
			for (int i = 0; i < n; i++) {
				s = sc.nextLine();
				for (int j = 0; j < s.length(); j++) {
					tab[i][j] = s.charAt(j);

				}
			}

			Set<Character> res = new HashSet<>();
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < s.length(); j++) {
					if (tab[i][j] != p) continue;
					if (i > 0 ) res.add(tab[i - 1][j]);
					if (i < n - 1 ) res.add(tab[i + 1][j]);
					if (j > 0 ) res.add(tab[i][j - 1]);
					if (j < m - 1 ) res.add(tab[i][j + 1]);
				}
			}
			res.remove(p);
			res.remove('.');
			
			//System.out.println(res);
			out.print(res.size());
		}
	}

}