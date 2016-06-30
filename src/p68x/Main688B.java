package p68x;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 */
public class Main688B {
	public static void main(String[] args) {
		run(System.in, System.out);
	}

	public static void run(InputStream in, PrintStream out) {

		try (Scanner sc = new Scanner(in)) {
			String s = sc.nextLine();
			StringBuilder rev = new StringBuilder(s).reverse();
			out.print(s + rev);
		}
	}

}