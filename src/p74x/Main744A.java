package p74x;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 */
public class Main744A {
	public static void main(String[] args) {
		run(System.in, System.out);
	}

	public static void run(InputStream in, PrintStream out) {
	
		try (Scanner sc = new Scanner(in)) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int k = sc.nextInt();
			
			boolean[] capital = new boolean[n];
			for (int i = 0; i < k; i++) {
				int v = sc.nextInt();
				capital[v-1] = true;
			}
			
			List<List<Integer>> edges = new ArrayList<>();
			for (int i = 0; i < n; i++) {
				edges.add(new ArrayList<Integer>());
			}
			
			for (int i = 0; i < m; i++) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				edges.get(a-1).add(b-1);
				edges.get(b-1).add(a-1);
			}

			boolean[] visited = new boolean[n];
			
			List<List<Integer>> comps = new ArrayList<>();
			for(int i= 0; i<n; i++) {
				if (visited[i]) continue;
				List<Integer> comp = new ArrayList<>();
				comps.add(comp);
				
				Deque<Integer> todo = new LinkedList<Integer>();
				todo.add(i);
				while(!todo.isEmpty()) {
					int v = todo.pop();
					if (visited[v]) continue;
					comp.add(v);
					visited[v] = true;
					for (int j: edges.get(v)) {
						if (!visited[j]) todo.push(j);
					}
				}
			}
			
			// for (int i = 0; i < comps.size(); i++) {
			// System.err.println("Component " + i);
			// System.err.println(comps.get(i));
			// }
			
				

			List<Integer> compswithcap = new ArrayList<>();
			int nbEdgesInCompWithoutCapital = 0;

					
			for (int i = 0; i < comps.size(); i++) {
				boolean containscap = false;
				for (int j:comps.get(i)) {
					if (capital[j]) containscap = true;
				}
				if (containscap) compswithcap.add(comps.get(i).size());
				else nbEdgesInCompWithoutCapital += comps.get(i).size();
			}
			
			
			Collections.sort(compswithcap, Collections.reverseOrder());
			//System.err.println("Comps with cap " + compswithcap);
			//System.err.println("Autres " + nbEdgesInCompWithoutCapital);
			long res = 0;
			for (int i = 0; i < compswithcap.size(); i++) {
				int v = compswithcap.get(i);
				if (i == 0) v+= nbEdgesInCompWithoutCapital;
				res += v*(v-1)/2;
				//System.err.println(res);
			}
		
			out.print(res - m);
		}
	}

}