package p78x;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

/**
 */
public class Main789C {
	public static void main(String[] args) {
		run(System.in, System.out);
	}

	public static void run(InputStream in, PrintStream out) {

		try (Scanner sc = new Scanner(in)) {
			int n = sc.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}

			int[] t1 = new int[n - 1];
			for (int i = 1; i < n; i++) {
				if (i % 2 == 0)
					t1[i - 1] = -abs(a[i - 1] - a[i]);
				else
					t1[i - 1] = abs(a[i - 1] - a[i]);
			}

			int[] t2 = new int[n - 2];
			for (int i = 2; i < n; i++) {
				if (i % 2 == 0)
					t2[i - 2] = abs(a[i - 1] - a[i]);
				else
					t2[i - 2] = -abs(a[i - 1] - a[i]);
			}

			System.err.println(Arrays.toString(t1));
			System.err.println(Arrays.toString(t2));

			long max = 0;
			long cur = 0;
			for (int i = 0; i < t1.length; i++) {
				if (cur > max)
					max = cur;
				if (cur + t1[i] < 0)cur = 0;
				else cur += t1[i];

			}
			if (cur > max)
				max = cur;

			cur = 0;
			for (int i = 0; i < t2.length; i++) {
				if (cur > max)
					max = cur;
				if (cur + t2[i] < 0)cur = 0;
				else cur += t2[i];

			}
			if (cur > max)
				max = cur;

			out.print(max);
		}
	}

	public static int abs(int a) {
		if (a < 0)
			return -a;
		else
			return a;
	}

}