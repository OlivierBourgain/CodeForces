package p87x;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 */
public class Main877B {
	public static void main(String[] args) {
		run(System.in, System.out);
	}

	public static void run(InputStream in, PrintStream out) {

		try (Scanner sc = new Scanner(in)) {
			String s = sc.nextLine();
			//System.err.println(s);
			int[] prefa = new int[s.length()];
			int[] prefb = new int[s.length()];

			prefa[0] = s.charAt(0) == 'a' ? 1 : 0;
			prefb[0] = s.charAt(0) == 'b' ? 1 : 0;
			for (int i = 1; i < s.length(); i++) {
				prefa[i] = prefa[i - 1];
				prefb[i] = prefb[i - 1];

				if (s.charAt(i) == 'a') prefa[i]++;
				else prefb[i]++;
			}

			int nba = prefa[s.length() - 1];
			//System.err.println(Arrays.toString(prefa));
			//System.err.println(Arrays.toString(prefb));
			//System.err.println(nba);

			int max = -1;
			for(int i = 0; i<s.length(); i++) {
				for (int j = i; j < prefb.length; j++) {
					int nb = prefa[i] + prefb[j] - prefb[i] + nba - prefa[j];
					// Special case when i = 0
					if (i == 0) nb = prefa[0] + prefb[j] + nba - prefa[j];
					if (nb > max) {
						//System.err.println("New max for "  +i + "/" + j + " = " + nb);
						max = nb;
					}
				}
			}

			out.print(max);
		}
	}

}