package p80x;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 */
public class Main804D {
	public static void main(String[] args) {
		run(System.in, System.out);
	}

	public static void run(InputStream in, PrintStream out) {

		try (Scanner sc = new Scanner(in)) {
			String s = sc.nextLine();
			
			long res = 0;
			
			int cptb = 0;
			long pow2 = 1;
			int idxpow = 0;
			
			for(int i = 0; i< s.length(); i++) {
				if (s.charAt(i) == 'b') {
					while(idxpow != (i-cptb)) {
						pow2 = (pow2*2) % MOD;
						idxpow++;
					}
					res = (pow2 - 1 + res) % MOD;
					cptb++;
				}
			}

			out.print(res);
		}
	
	}

	public static long MOD = 1000000007;


}