package p81x;
// Contest #416
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 */
public class Main811A {
	public static void main(String[] args) {
		run(System.in, System.out);
	}

	public static void run(InputStream in, PrintStream out) {

		try (Scanner sc = new Scanner(in)) {
			int vladik = sc.nextInt();
			int valera = sc.nextInt();
			
			int cpt = 1;
			while(true) {
				if (vladik < cpt) {
					out.print("Vladik");
					return;
				}
				vladik -= cpt;
				cpt ++;
				if (valera < cpt) {
					out.print("Valera");
					return;
				}
				valera -= cpt;
				cpt ++;				
			}

		}
	}

}