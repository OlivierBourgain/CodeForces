package p72x;

import java.io.InputStream;
import java.io.PrintStream;
import java.math.BigInteger;
import java.util.Scanner;

/**
 */
public class Main725B {
	public static void main(String[] args) {
		run(System.in, System.out);
	}

	public static void run(InputStream in, PrintStream out) {

		try (Scanner sc = new Scanner(in)) {
			String s = sc.nextLine();
			
			long row = Long.parseLong(s.substring(0, s.length() - 1));
			char seat = s.charAt(s.length() - 1);
			row--;
			BigInteger res = new BigInteger("" + (row/4));
			res = res.multiply(new BigInteger("16"));
			if (row % 4 == 1 || row % 4 == 3) res = res.add(new BigInteger("7"));

			switch (seat) {
			case 'a':
				res = res.add(new BigInteger("4"));
				break;
			case 'b':
				res = res.add(new BigInteger("5"));
				break;
			case 'c':
				res = res.add(new BigInteger("6"));
				break;
			case 'd':
				res = res.add(new BigInteger("3"));
				break;
			case 'e':
				res = res.add(new BigInteger("2"));
				break;
			case 'f':
				res = res.add(new BigInteger("1"));
				break;
			}

			out.print(res);
		}
	}

}