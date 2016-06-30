package p68x;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

/**
 */
public class Main682C {
	public static void main(String[] args) {
		run(System.in, System.out);
	}

	static class Node {
		long val;

		public Node(long val) {
			this.val = val;
		}

		Map<Integer, Integer> edges = new HashMap<>();

		@Override
		public String toString() {
			return "" + val + "  -> " + edges.toString();
		}

	}

	public static void run(InputStream in, PrintStream out) {

		try (Scanner sc = new Scanner(in)) {
			int n = sc.nextInt();
			Node[] graph = new Node[n + 1];
			for (int i = 1; i <= n; i++) {
				graph[i] = new Node(sc.nextInt());
			}

			for (int i = 1; i < n; i++) {
				int j = sc.nextInt();
				int k = sc.nextInt();
				graph[j].edges.put(i + 1, k);
			}
			//System.out.println(Arrays.toString(graph));

			long restant = dfs(graph, n);
			//System.out.println(Arrays.toString(graph));
			out.print(n - restant);
		}

	}

	private static long dfs(Node[] graph, int n) {
		long[] dist = new long[n + 1];
		Deque<Integer> todo = new LinkedList<Integer>();
		todo.add(1);
		long res = 1;

		while (!todo.isEmpty()) {
			int i = todo.pop();
			Node node = graph[i];
			//System.out.println("Node " + node);

			Iterator<Integer> it = node.edges.keySet().iterator();
			while (it.hasNext()) {
				int j = it.next();
				if (max(dist[i], 0) + node.edges.get(j) <= graph[j].val) {
					//System.out.println(" Child " + j + " is OK");
					dist[j] = max(dist[i], 0) + node.edges.get(j);
					todo.push(j);
					res++;
				} else {
					//System.out.println(" Child " + j + " deleted");
				}
			}

		}
		return res;

	}

	private static long max(long a, long b) {
		return a < b ? b : a;
	}

}