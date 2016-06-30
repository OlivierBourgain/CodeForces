package p00x;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * Input : 1 nombre
 * Output : 1 int
 */
public class Main4B {
	public static void main(String[] args) {
		run(System.in, System.out);
	}

	public static void run(InputStream in, PrintStream out) {
		try (Scanner sc = new Scanner(in)) {
			int d = sc.nextInt();
			int sumtime = sc.nextInt();

			int[] mintime = new int[d];
			int[] maxtime = new int[d];
			int[] actualtime = new int[d];
			for (int i = 0; i < d; i++) {
				mintime[i] = sc.nextInt();
				maxtime[i] = sc.nextInt();
				actualtime[i] = mintime[i];
				sumtime -= mintime[i];
			}

			if (sumtime < 0) {
				out.println("NO");
				return;
			}

			for (int i = 0; i < d; i++) {
				if (sumtime > 0) {
					int n = min(sumtime, maxtime[i] - mintime[i]);
					actualtime[i] += n;
					sumtime -=n;
				}
			}
			
			if (sumtime > 0) {
				out.println("NO");
				return;
			}

			out.println("YES");
			String res = "";
			for (int i = 0; i < d; i++) {
				res += actualtime[i] + " ";
			}
			out.println(res.trim());
		}
	}

	private static int min(int a, int b) {
		return a<b?a:b;
	}

}