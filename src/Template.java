import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 */
public class Template {
	public static void main(String[] args) {
		run(System.in, System.out);
	}

	public static void run(InputStream in, PrintStream out) {

		try (Scanner sc = new Scanner(in)) {
			int n = sc.nextInt();
			for (int i = 0; i < n; i++) {
			}

			out.print("");
		}
	}

}