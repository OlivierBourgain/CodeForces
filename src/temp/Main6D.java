package temp;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 */
public class Main6D {
	public static void main(String[] args) {
		run(System.in, System.out);
	}

	public static void run(InputStream in, PrintStream out) {

		try (Scanner sc = new Scanner(in)) {
			int n = sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();
			int[] t = new int[n];
			for (int i = 0; i < n; i++) {
				t[i] = sc.nextInt();
			}

			List<Integer> res = new ArrayList<>();
			int x = 0;
			int y = n - 1;
			while (x < y) {
				while (t[x] <= 0 && x < n - 1)
					x++;
				while (t[y] <= 0 && y > 1)
					y--;
				System.out.println(Arrays.toString(t));
				System.out.println(x + " / " + y);
				if (t[x] <= 0 && t[y] <= 0) break;

				if (t[x] > t[y] || y <= 1) {
					int cpt = t[x] / b + 1;
					for (int i = 0; i < cpt; i++) {
						res.add(x + 2);
					}
					t[x] -= b * cpt;
					t[x + 1] -= a * cpt;
					t[x + 2] -= b * cpt;
					x++;
				} else {
					int cpt = t[y] / b + 1;
					for (int i = 0; i < cpt; i++) {
						res.add(y);
					}
					t[y] -= b * cpt;
					t[y - 1] -= a * cpt;
					t[y - 2] -= b * cpt;
					y--;
				}
			}
			out.println(res.size());
			Collections.sort(res);
			for (Integer i : res) {
				out.print(i + " ");

			}
		}
	}

}