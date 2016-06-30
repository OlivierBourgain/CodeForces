package p68x;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 */
public class Main687A {
	public static void main(String[] args) {
		run(System.in, System.out);
	}

	public static void run(InputStream in, PrintStream out) {

		try (Scanner sc = new Scanner(in)) {
			int n = sc.nextInt();
			int m = sc.nextInt();

			int[] color = new int[n];
			boolean[] visited = new boolean[n];

			List<List<Integer>> adj = new ArrayList<>();
			for (int i = 0; i < n; i++) {
				adj.add(new ArrayList<>());
				color[i] = -1;
			}

			for (int i = 0; i < m; i++) {
				int u = sc.nextInt();
				int v = sc.nextInt();
				adj.get(u - 1).add(v - 1);
				adj.get(v - 1).add(u - 1);
			}

			Deque<Integer> stack = new LinkedList<Integer>();
			int idx = 0;
			while (true) {
				int start = findUnvisitedNode(idx, adj, visited);
				if (start == -1) break;
				idx = start;
				stack.push(start);
				color[start] = 0;
				visited[start] = true;
				while (!stack.isEmpty()) {
					int node = stack.pop();
					int c = color[node];

					for (Integer voisin : adj.get(node)) {
						if (color[voisin] == c) {
							out.print("-1");
							return;
						}
						if (!visited[voisin]) {
							color[voisin] = 1 - color[node];
							visited[voisin] = true;
							stack.push(voisin);
						}
					}
				}
			}

			int c0 = 0;
			int c1 = 0;
			StringBuilder s0 = new StringBuilder();
			StringBuilder s1 = new StringBuilder();

			for (int i = 0; i < color.length; i++) {
				if (color[i] == 0) c0++;
				if (color[i] == 0) s0.append(i + 1).append(' ');
				if (color[i] == 1) c1++;
				if (color[i] == 1) s1.append(i + 1).append(' ');

			}
			out.println(c0);
			out.println(s0.toString().trim());
			out.println(c1);
			out.println(s1.toString().trim());

		}
	}

	private static int findUnvisitedNode(int idx, List<List<Integer>> adj, boolean[] visited) {
		for (int i = idx; i < adj.size(); i++) {
			if (!adj.get(i).isEmpty() && !visited[i]) return i;
		}
		return -1;
	}

}