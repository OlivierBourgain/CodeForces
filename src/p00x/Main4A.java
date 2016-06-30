package p00x;

import java.util.Scanner;

public class Main4A {
	public static void main(String[] args) {
		// Use the Scanner class
		try (Scanner sc = new Scanner(System.in)) {

			int n = sc.nextInt();
			if (n % 2 == 0 && n > 2) System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}