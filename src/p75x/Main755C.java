package p75x;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 */
public class Main755C {
	public static void main(String[] args) {
		run(System.in, System.out);
	}

	public static void run(InputStream in, PrintStream out) {

		try (Scanner sc = new Scanner(in)) {
			int n = sc.nextInt();
			int[] t = new int[n+1];
 			for (int i = 1; i <= n; i++) {
 				int j = sc.nextInt();
 				if (t[j] == 0) {
 					t[j] = j;
 	 				t[i] = j;
 				} else {
 					t[i] = t[j];
 				}
			}
 			//System.err.println(Arrays.toString(t));
 			int res = 0;
 			for (int i = 1; i <= n; i++) {
 				if (t[i] == i) res++;
				
			}
			out.print(res);
		}
	}

}