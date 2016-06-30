package p00x;
import java.util.Scanner;

public class Main001A {
	public static void main(String[] args) {
		// Use the Scanner class
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int a = sc.nextInt();

		long res = 0;
		if (n % a == 0)
			res = n / a;
		else
			res = n / a + 1;

		if (m % a == 0)
			res *= m / a;
		else
			res *= m / a + 1;
		System.out.println(res);
		sc.close();
	}
}