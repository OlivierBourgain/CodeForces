package p75x;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 */
public class Main755A {
	public static void main(String[] args) {
		run(System.in, System.out);
	}

	public static void run(InputStream in, PrintStream out) {

		List<Integer> composite = new ArrayList<>();
		for (int i = 2; i < 320; i++) {
			int k = i * 2;
			while (k <= 100000) {
				composite.add(k);
				k += i;
			}
		}
		
		try (Scanner sc = new Scanner(in)) {
			int n = sc.nextInt();

			for (int m = 1; m < 1000; m++) {
				if (composite.contains(m * n + 1)) {
					out.print(m);
					return;
				}
			}
		}
	}

}