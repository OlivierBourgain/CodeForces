package p35x;
import java.util.Scanner;

public class Main353A {
	public static void main(String[] args) {
		// Use the Scanner class
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		System.out.println(go(a, b, c));
		sc.close();
	}

	public static String go(int a, int b, int c) {
		if (a == b) {
			return "YES";
		}
		
		if (c==0) return "NO";

		int diff = b - a;
		if (diff % c != 0) {
			return "NO";
		}

		if (diff > 0 && c > 0)
			return "YES";
		if (diff < 0 && c < 0)
			return "YES";

		return "NO";
	}

}