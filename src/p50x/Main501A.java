package p50x;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 */
public class Main501A {
	public static void main(String[] args) {
		run(System.in, System.out);
	}

	public static void run(InputStream in, PrintStream out) {
		try (Scanner sc = new Scanner(in)) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int d = sc.nextInt();

			int misha = max(3 * a / 10, a - a / 250 * c);
			int vasya = max(3 * b / 10, b - b / 250 * d);

			if (misha == vasya) out.println("Tie");
			else if (misha > vasya) out.println("Misha");
			else
				out.println("Vasya");
		}
	}

	private static int max(int i, int j) {
		return i > j ? i : j;
	}

}