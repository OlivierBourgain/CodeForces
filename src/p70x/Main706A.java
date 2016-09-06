package p70x;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 */
public class Main706A {
	public static void main(String[] args) {
		run(System.in, System.out);
	}

	public static void run(InputStream in, PrintStream out) {

		try (Scanner sc = new Scanner(in)) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int n = sc.nextInt();
			
			double res=Double.MAX_VALUE;
			for (int i = 0; i < n; i++) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				int v=  sc.nextInt();
				
				double t = Math.sqrt((x-a)*(x-a) + (y-b)*(y-b)) / v;
				if (t<res) res=t;
			}

			out.print(res);
		}
	}

}