package p89x;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 */
public class Main892C {
	public static void main(String[] args) {
		run(System.in, System.out);
	}

	public static void run(InputStream in, PrintStream out) {

		try (Scanner sc = new Scanner(in)) {
			int n = sc.nextInt();
			if (n == 1) {
				int a = sc.nextInt();
				out.print(a == 1 ? "0" : "-1");
				return;
			}

			int[] t = new int[n];
			int nbOfOnes = 0;
			for (int i = 0; i < n; i++) {
				t[i] = sc.nextInt();
				if (t[i] == 1) nbOfOnes++;
			}

			if (nbOfOnes > 0) {
				out.print(n - nbOfOnes);
				return;
			}

			// Check if possible
			int gcd = gcd(t[0], t[1]);
			for (int i = 2; i < n; i++)
				gcd = gcd(gcd, t[i]);
			if (gcd != 1) {
				out.print("-1");
				return;
			}

		
			int bestSeg = Integer.MAX_VALUE;
			for(int i = 0; i<n-1; i++) {
				//System.err.println("Gcd of " + t[i] + " & " + t[i+1] + "=" + gcd(t[i], t[i+1]));

				int g = gcd(t[i], t[i+1]);
				if (g == 1) {
					bestSeg = 1;
					break;
				}
				for (int j = i+2; j < n; j++) {
					//System.err.println("Gcd of " + g + " & " + t[j] + "=" + gcd(g, t[j]));
					g = gcd(g, t[j]);
					if (g == 1 && j-i < bestSeg) {
						//System.err.println("Using " + Arrays.toString(Arrays.copyOfRange(t, i, j + 1)));
						bestSeg = j-i;
						break;
					}
					
				}
				//System.err.println("Swapping " + best);
				//System.err.println(Arrays.toString(t));
			}
			out.print(bestSeg + n - 1);
		}
	}

	static int gcd(int a, int b) {
		if (b > a) return gcd(b, a);
		while (a != 0 && b != 0) {
			int c = b;
			b = a % b;
			a = c;
		}
		return a + b; // either one is 0, so return the non-zero value
	}

}