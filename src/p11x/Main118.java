package p11x;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * Input : 1 nombre
 * Output : 1 int
 */
public class Main118 {
	public static void main(String[] args) {
		run(System.in, System.out);
	}


	public static void run(InputStream in, PrintStream out) {
		// Use the Scanner class
		try (Scanner sc = new Scanner(in)) {
			String s= sc.nextLine();
			StringBuilder res=new StringBuilder();
			for (int i = 0; i<s.length(); i++) {
				char c = s.charAt(i);
				if (c >= 'A' && c <='Z') c = (char) (c - 'A' + 'a');
				if (c == 'a' || c == 'e' || c == 'i' || c== 'o' || c=='u' || c == 'y') {
					
				} else {
					res.append('.').append(c);
				}
			}
			out.println(res.toString());

		}
	}

}