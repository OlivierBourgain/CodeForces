package p79x;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 */
public class Main796C {
	public static void main(String[] args) {
		FastScanner in = new FastScanner(new BufferedReader(new InputStreamReader(System.in)));
		run(in, System.out);
	}

	public static void runTest(InputStream is, PrintStream out) {
		FastScanner in = new FastScanner(new BufferedReader(new InputStreamReader(is)));
		run(in, out);
	}
	
	public static class Node {
		int idx;
		int str;
		boolean offline = false;
		List<Integer> links = new ArrayList<>();

		public Node(int idx, int str) {
			this.idx = idx;
			this.str = str;
		}

	}
	public static void run(FastScanner sc, PrintStream out) {


			int n = sc.nextInt();
			Node[] nodes = new Node[n];
			int maxstr = 0;
			for (int i = 0; i < n; i++) {
				int str = sc.nextInt();
				nodes[i] = new Node(i, str);
				if (str > nodes[maxstr].str) maxstr = i;
			}

			for (int i = 0; i < n - 1; i++) {
				int a = sc.nextInt() - 1;
				int b = sc.nextInt() - 1;
				nodes[a].links.add(b);
				nodes[b].links.add(a);
			}

			Queue<Node> queue = new LinkedList<Node>();

			System.err.println("Node max = " + (maxstr + 1));

			int start = maxstr;
			// If there is a semineighbour with same str, it is best to start in
			// the middle.
			for (Integer i : nodes[maxstr].links) {
				for (Integer j : nodes[i].links) {
					if (j != maxstr && nodes[j].str == nodes[maxstr].str) {
						//System.err.println("As str["+j+"]="+nodes[j].str +", start will be " + start);
						start = i;
						break;
					}
				}
			}

			System.err.println("Start = " + (start + 1));

			queue.add(nodes[start]);

			int res = Integer.MIN_VALUE;
			while (!queue.isEmpty()) {
				// Get the Node with biggest str
				Node node = queue.poll();

				node.offline = true;
				//System.err.println("Killing node " + (node.idx + 1));
				if (node.str > res) res = node.str;

				// Increase str
				for (Integer i : node.links) {
					if (!nodes[i].offline) {
						nodes[i].str++;
						queue.add(nodes[i]);
						for (Integer j : nodes[i].links) {
							if (node.idx != j) nodes[j].str++;
						}
					}
				}
			}

			out.print(res);
	}

	static class FastScanner {
		BufferedReader in;
		StringTokenizer st;

		public FastScanner(BufferedReader in) {
			this.in = in;
		}

		public String nextToken() {
			while (st == null || !st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(in.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		public int nextInt() {
			return Integer.parseInt(nextToken());
		}

		public long nextLong() {
			return Long.parseLong(nextToken());
		}

		public double nextDouble() {
			return Double.parseDouble(nextToken());
		}
	}

}