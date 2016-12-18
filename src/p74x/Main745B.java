package p74x;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 */
public class Main745B {
	public static void main(String[] args) {
		run(System.in, System.out);
	}

	public static void run(InputStream in, PrintStream out) {
		
		try (Scanner sc = new Scanner(in)) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			sc.nextLine();
			boolean[][] tab = new boolean[n][m]; 
			int firstline = -1;
			int lastline = 0;
			for (int i = 0; i < n; i++) {
				String s = sc.nextLine();
				if (s.contains("X") && firstline == -1) firstline = i;
				if (s.contains("X")) lastline = i;
				for (int j = 0; j < m; j++) {
					if (s.charAt(j)  == 'X') tab[i][j] = true;
				}
			}
			
			// Piece should be a rectangle
			int firstcol = 0;
			while(!tab[firstline][firstcol]) firstcol++;
			int lastcol = m -1;
			while(!tab[firstline][lastcol]) lastcol--;
			
			
			// System.err.println("Line " + firstline + " to " + lastline);
			// System.err.println("Col " + firstcol + " to " + lastcol);
			
			String res = "YES";
			for(int i = firstline; i<= lastline; i++) {
				for(int j = 0; j < m; j++) {
					if (j < firstcol && tab[i][j]) {
						res = "NO";
						break;
					}
					else if (j > lastcol && tab[i][j]) {
						res = "NO";
						break;
					} else if (j>= firstcol && j <= lastcol && !tab[i][j]) {
						res = "NO";
						break;
					}
					
				}
			}
			out.print(res);
		}
	}

}