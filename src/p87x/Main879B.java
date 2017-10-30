package p87x;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

/**
 */
public class Main879B {
	public static void main(String[] args) {
		run(System.in, System.out);
	}

	public static void run(InputStream in, PrintStream out) {

		try (Scanner sc = new Scanner(in)) {
			int n = sc.nextInt();
			long k = sc.nextLong();

			int[] a = new int[n];
			int max = -1;
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
				if (a[i] > max) max = a[i];
			}

			if (k >= n - 1) {
				out.print(max);
				return;
			}

			// Simulate
			Deque<Integer> q = new LinkedList<Integer>();
			for (int i = 0; i < n; i++)
				q.add(a[i]);
			
			int cur = q.pop();
			int streak = 0;
			while(true) {
				int op = q.pop();
				if (op > cur) {
					q.add(cur);
					cur = op;
					streak = 1;
				} else {
					q.add(op);
					streak++;
				}
				if (streak >= k) {
					out.print(cur);
					break;
				}
				
			}

		}
	}

}