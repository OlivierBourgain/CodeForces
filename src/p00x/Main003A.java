package p00x;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * Input : 1 nombre et une string
 * Output : 1 int
 */
public class Main003A {
	public static void main(String[] args) {
		run(System.in, System.out);
	}

	public static void run(InputStream in, PrintStream out) {
		// Use the Scanner class
		Scanner sc = new Scanner(in);
		String start = sc.nextLine();
		String end = sc.nextLine();
		
		int xs = start.charAt(0) - 'a';
		int ys = start.charAt(1) - '0';
		int xt = end.charAt(0) - 'a';
		int yt = end.charAt(1) - '0';

		out.println(max(abs(xt-xs),abs(yt-ys)));
		while(xs != xt || ys != yt) {
			String s = "";
			if(xs < xt) {
				s+="R";
				xs++;
			} else if (xs > xt) {
				s+="L";
				xs--;
			}
			if(ys < yt) {
				s+="U";
				ys++;
			} else if (ys > yt) {
				s+="D";
				ys--;
			}

			
			out.println(s);
		}
		sc.close();
	}

	private static int max(int a, int b) {
		return a<b?b:a	;
	}

	private static int abs(int i) {
		return i<0?-i:i;
	}


}