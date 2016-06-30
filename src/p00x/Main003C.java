package p00x;

import java.util.Scanner;

public class Main003C {
	public static void main(String[] args) {
		// Use the Scanner class
		try (Scanner sc = new Scanner(System.in)) {
			char[][] t = new char[3][3];
			int nbX = 0;
			int nb0 = 0;
			for (int i = 0; i < 3; i++) {
				String s = sc.nextLine();
				for (int j = 0; j < 3; j++) {
					switch (s.charAt(j)) {
					case 'X':
						nbX++;
						t[i][j] = 'X';
						break;
					case '0':
						nb0++;
						t[i][j] = '0';
						break;
					case '.':
						t[i][j] = '.';
						break;
					}
				}

			}

			String res = "";
			if (nbX < nb0 || nbX > nb0 + 1) res = "illegal";
			else if (isWin(t, 'X')) {
				if (nbX == nb0) res = "illegal";
				else
					res = "the first player won";
			} else if (isWin(t, '0')) {
				if (nbX > nb0) res = "illegal";
				else
					res = "the second player won";
			} else if (nbX + nb0 == 9) {
				res = "draw";
			} else if (nbX == nb0) {
				res = "first";
			} else {
				res = "second";
			}

			System.out.println(res);
		}
	}

	private static boolean isWin(char[][] t, char c) {

		for (int i = 0; i < 3; i++) {
			if (t[0][i] == c && t[1][i] == c && t[2][i] == c) return true;
			if (t[i][0] == c && t[i][1] == c && t[i][2] == c) return true;
		}
		// Diagonal 1
		if (t[0][0] == c && t[1][1] == c && t[2][2] == c) return true;

		// Diagonal 2
		if (t[2][0] == c && t[1][1] == c && t[0][2] == c) return true;

		return false;
	}

	/*
	 * 
	 * X0X
	 * .0.
	 * .X.
	 */

}