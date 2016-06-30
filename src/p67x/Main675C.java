package p67x;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main675C {

	public static void main(String[] args) {
		// Use the Scanner class
		try (Scanner sc = new Scanner(System.in)) {

			int n = sc.nextInt();

			Map<Long, Integer> d = new HashMap<>();
			long sum = 0;

			int ans = n - 1;
			for (int i = 0; i < n; i++) {
				int t = sc.nextInt();
				sum += t;
				Integer l = d.get(sum);
				if (l == null) d.put(sum, 1);
				else
					d.put(sum, l + 1);
				ans = min(ans, n - d.get(sum));
			}
			System.out.println(ans);
		}
	}

	private static int min(int a, int b) {

		return a < b ? a : b;
	}

}
