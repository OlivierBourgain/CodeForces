package p76x;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 */
public class Main767B {
	public static void main(String[] args) {
		run(System.in, System.out);
	}

	public static void run(InputStream in, PrintStream out) {

		try (Scanner sc = new Scanner(in)) {
			long ts = sc.nextLong();
			long tf = sc.nextLong();
			long d = sc.nextLong();
			int n = sc.nextInt();

			long[] t = new long[n];
			for (int i = 0; i < n; i++) {
				t[i] = sc.nextLong();
			}

			if (n == 0) {
				out.print(ts);
				return;
			}
			int nextclientidx = 0;
			long curtime = ts;

			long res = t[0] - 1;
			long mindelay = Long.MAX_VALUE;

			while (nextclientidx < n && curtime < tf) {

				if (t[nextclientidx] > curtime) {
					out.print(curtime);
					return;
				}

				if (t[nextclientidx] > 0 && curtime - t[nextclientidx] + 1 < mindelay && (tf - curtime) >= d) {
					res = t[nextclientidx] - 1;
					mindelay = curtime - res;
				}
				curtime = curtime + d;
				nextclientidx++;
			}
			if (curtime <= (tf - d)) {
				out.print(curtime);
				return;
			}
			out.print(res);
		}
	}

}