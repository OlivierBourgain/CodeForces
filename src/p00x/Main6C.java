package p00x;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 */
public class Main6C {
	public static void main(String[] args) {
		run(System.in, System.out);
	}

	public static void run(InputStream in, PrintStream out) {

		try (Scanner sc = new Scanner(in)) {
			int n = sc.nextInt();
			int[] t = new int[n];
			for (int i = 0; i < n; i++) {
				t[i] = sc.nextInt();
			}
			
			if (n==1) {
				out.print("1 0");
				return;
			}
			int a = 0;
			int b = n - 1;

			while (a < b - 1) {
				if (t[a] < t[b]) {
					t[b] -= t[a];
					a++;
				} else if (t[b] < t[a]) {
					t[a] -= t[b];
					b--;
				} else if (t[a] == t[b]) {
					if (a==b-2) {
						a++;
					} else {
						a++;
						b--;
					}
				}
				
			}
			
			out.print((a + 1) + " " + (n - b));
		}
	}

}