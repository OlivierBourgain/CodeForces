package p67x;

import java.util.Scanner;

public class Main673A {
	public static void main(String[] args) {
		// Use the Scanner class
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();

			if (n == 0) {
				System.out.println(15);
				sc.close();
				return;
			}
			int max = 15;
			for (int i = 0; i < n; i++) {
				int j = sc.nextInt();
				if (j <= max) max = j + 15;
				else {
					System.out.println(max);
					return;
				}
			}
			if (max < 90) System.out.println(max);
			else
				System.out.println(90);
		}
	}

}