package temp;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * Codeforces Round #355 (Div. 2)
 */
public class Main677D {
	public static void main(String[] args) {
		run(System.in, System.out);
	}

	public static class Coffre {
		int i, j;
		int val;
		int dist = Integer.MAX_VALUE;

		public Coffre(int i, int j, int val) {
			this.i = i;
			this.j = j;
			this.val = val;

		}

		public String toString() {
			return i + "/" + j + ". Val=" + val + ". Dist=" + dist;
		}
	}

	public static void run(InputStream in, PrintStream out) {

		try (Scanner sc = new Scanner(in)) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int p = sc.nextInt();

			Map<Integer, List<Coffre>> coffres = new HashMap<>();
			for (int i = 0; i <= p; i++) {
				coffres.put(i, new ArrayList<Coffre>());
			}

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					int v = sc.nextInt();
					Coffre c = new Coffre(i, j, v);
					coffres.get(v).add(c);
				}
			}

			List<Coffre> unSettledNodes = new ArrayList<>();
			Coffre start = new Coffre(0, 0, 0);
			start.dist = 0;
			unSettledNodes.add(start);

			while (!unSettledNodes.isEmpty()) {
				Coffre evaluationNode = getClosestCoffre(unSettledNodes);
				unSettledNodes.remove(evaluationNode);
				// System.err.println("Looking at " + evaluationNode);
				if (evaluationNode.val == p) {
					out.println(evaluationNode.dist);
					return;
				}
				for (Coffre destinationNode : coffres.get(evaluationNode.val + 1)) {
					int newDist = evaluationNode.dist + dist(evaluationNode, destinationNode);
					if (destinationNode.dist > newDist) {
						destinationNode.dist = newDist;
						unSettledNodes.add(destinationNode);
					}
				}
			}
		}
	}

	private static Coffre getClosestCoffre(List<Coffre> cs) {
		int min = Integer.MAX_VALUE;
		Coffre res = null;
		for (Coffre c : cs) {
			if (c.dist < min) {
				min = c.dist;
				res = c;
			}

		}
		return res;
	}

	private static int dist(Coffre a, Coffre b) {
		int res = (int) (Math.abs(a.i - b.i) + Math.abs(a.j - b.j));
		return res;
	}

}