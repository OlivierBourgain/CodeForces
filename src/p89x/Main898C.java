package p89x;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 */
public class Main898C {
	public static void main(String[] args) {
		run(System.in, System.out);
	}

	public static void run(InputStream in, PrintStream out) {

		try (Scanner sc = new Scanner(in)) {
			int n = sc.nextInt();
			sc.nextLine();
			Map<String, List<String>> dir = new HashMap<>();
			for (int i = 0; i < n; i++) {
				String line = sc.nextLine();
				String[] t = line.split(" ");
				String name = t[0];
				int m = Integer.parseInt(t[1]);
				List<String> l = dir.get(name);
				if (l == null) {
					l = new ArrayList<>();
					dir.put(name, l);
				}

				for (int j = 0; j < m; j++) {
					l.add(t[j + 2]);
				}
			}

			out.println(dir.size());

			for (String name : dir.keySet()) {
				List<String> l = dir.get(name);

				l.sort(new Comparator<String>() {

					@Override
					public int compare(String o1, String o2) {
						return o2.length() - o1.length();
					}
				});
				
				List<String> listToPrint = new ArrayList<>();
				for (int i = 0; i<l.size(); i++) {
					boolean toPrint = true;

					for (int j = 0; j<i; j++) {
						if (l.get(j).endsWith(l.get(i))) {
							toPrint = false;
							break;
						}
					}
					if (toPrint) listToPrint.add(l.get(i));
				}
					
				out.print(name + " " + listToPrint.size());
				for(String num:listToPrint) out.print(" " + num);
				out.println();
			}
			out.print("");
		}
	}

}