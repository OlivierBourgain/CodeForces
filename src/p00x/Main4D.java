package p00x;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Input : 1 nombre
 * Output : 1 int
 */
public class Main4D {
	public static void main(String[] args) {
		run(System.in, System.out);
	}

	static class Env {
		int w, h, idx;

		public Env(int w, int h, int idx) {
			this.w = w;
			this.h = h;
			this.idx = idx;
		}

		@Override
		public String toString() {
			return w + "/" + h;
		}
	}

	public static void run(InputStream in, PrintStream out) {
		// Use the Scanner class
		try (Scanner sc = new Scanner(in)) {
			int n = sc.nextInt();
			int w = sc.nextInt();
			int h = sc.nextInt();

			List<Env> list = new ArrayList<>();
			for (int i = 0; i < n; i++) {
				int wj = sc.nextInt();
				int hj = sc.nextInt();
				if (wj > w && hj > h) list.add(new Env(wj, hj, i + 1));
			}

			if (list.size() == 0) {
				out.println("0");
				return;
			}

			Collections.sort(list, (env1, env2) -> (env1.w - env2.w));
			//System.err.println(list);

			int[] pred = new int[list.size()];
			int[] size = new int[list.size()];

			pred[0] = -1;
			size[0] = 1;

			int maxsize = 1;
			int idx = 0;
			for (int i = 1; i < list.size(); i++) {
				//System.err.println("Looking at " + i + " = " + list.get(i));
				Env e1 = list.get(i);
				pred[i] = -1;
				size[i] = 1;
				for (int j = 0; j < i; j++) {
					Env e2 = list.get(j);
					if (e1.w > e2.w && e1.h > e2.h && size[j] >= size[i]) {
						size[i] = size[j] + 1;
						pred[i] = j;

						if (size[i] > maxsize) {
							maxsize = size[i];
							idx = i;
						}
					}
				}
				//System.err.println(Arrays.toString(size));
			}

			out.println(maxsize);
			String res = "";
			while (idx != -1) {
				res = list.get(idx).idx + " " + res;
				idx = pred[idx];
			}
			out.println(res.trim());

		}
	}

}