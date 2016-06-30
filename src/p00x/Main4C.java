package p00x;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main4C {
	public static void main(String[] args) {
		// Use the Scanner class
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			sc.nextLine();
			Map<String, Integer> map = new HashMap<>();
			for (int i = 0; i < n; i++) {
				String s = sc.nextLine();

				Integer count = map.get(s);
				if (count == null) {
					map.put(s, 0);
					System.out.println("OK");
				} else {
					map.put(s, count + 1);
					System.out.println(s + (count + 1));
				}

			}

		}
	}

}