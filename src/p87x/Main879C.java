package p87x;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 */
public class Main879C {
	public static void main(String[] args) {
		run(System.in, System.out);
	}

	public static void run(InputStream in, PrintStream out) {

		try (Scanner sc = new Scanner(in)) {
			int n = sc.nextInt();
			sc.nextLine();
			//System.err.println("####");
			int a = 1023;
			int b = 0;
		
			for (int i = 0; i < n; i++) {
				String s = sc.nextLine();
				char op  = s.charAt(0);
				int val = Integer.parseInt(s.substring(2));
				//System.err.println(s);
				switch(op) {
				case '|' : a |= val;b|=val;break;
				case '&' : a &= val;b&=val;break;
				case '^' : a ^= val;b^=val;break;
				}
			}
			
			//System.err.println(a+ " " + Integer.toBinaryString(a));
			//System.err.println(b + " " + Integer.toBinaryString(b));

			out.println("3");
			out.println("| " + (a&b));
			out.println("& " + (a|b));
			out.print("^ " + (~a&b));
		}
	}

}