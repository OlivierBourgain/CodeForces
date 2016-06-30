package p00x;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * Input : 1 nombre
 * Output : 1 int
 */
public class Main003D {
	public static void main(String[] args) {
		run(System.in, System.out);
	}

	public static class Joker {
		int i;
		int c1;
		int c2;
		int diff;

		public Joker(int i, int c1, int c2) {
			this.i = i;
			this.c1 = c1;
			this.c2 = c2;
			this.diff = c2 - c1;
		}

		@Override
		public String toString() {
			return "At " + i + ", cost = " + c1 + "/" + c2;
		}
	}

	public static void run(InputStream in, PrintStream out) {
		try (Scanner sc = new Scanner(in)) {
			String s = sc.nextLine();
			char[] t = s.toCharArray();
			int tmp = 0;
			long ans = 0;
			PriorityQueue<Joker> stack = new PriorityQueue<>((j1, j2) -> (j2.diff - j1.diff));
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == '(') {
					tmp++;
				} else if (s.charAt(i) == ')') {
					tmp--;
				} else {
					int c1 = sc.nextInt();
					int c2 = sc.nextInt();
					t[i] = ')';
					ans += c2;
					tmp--;
					stack.add(new Joker(i, c1, c2));
				}
				if (tmp < 0) {
					if (stack.isEmpty()) break;
					Joker j = stack.poll();
					tmp += 2;
					ans += j.c1 - j.c2;
					t[j.i] = '(';
				}
			}

			if (tmp != 0) {
				out.println("-1");
			} else {
				out.println(ans);
				out.println(new String(t));
			}
		}
	}

}