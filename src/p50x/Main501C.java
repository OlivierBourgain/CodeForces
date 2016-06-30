package p50x;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * 501C / 504A - Misha and Forest
 */
public class Main501C {
	public static void main(String[] args) {
		run(System.in, System.out);
	}

	public static class Node {
		public Node() {
		}
	}

	public static void run(InputStream in, PrintStream out) {
		try (Scanner sc = new Scanner(in)) {
			int n = sc.nextInt();

			Deque<Integer> free = new LinkedList<>();

			List<Node> graph = new ArrayList<Node>();
			List<String> edges = new ArrayList<String>();

			int[] deg = new int[n];
			int[] sum = new int[n];

			for (int i = 0; i < n; i++) {
				deg[i] = sc.nextInt();
				sum[i] = sc.nextInt();
				graph.add(new Node());
				if (deg [i]== 1) free.add(i);
			}

			// Fill forced nodes
			while (!free.isEmpty()) {
				
				//System.err.println("--------------- Freenodes " + free);
				int i = free.removeFirst();
				if (deg[i] == 0) continue;
				int j = sum[i];
				edges.add(i + " "+ j);
				sum[j] ^= i;
				deg[j]--;
				if (deg[j] == 1) free.add(j); 
			}
			out.println(edges.size());
			for (String s : edges) {
				out.println(s);
			}

		}
	}

}