package p88x;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 */
public class Main887C {
	public static void main(String[] args) {
		run(System.in, System.out);
	}

	public static void run(InputStream in, PrintStream out) {

		try (Scanner sc = new Scanner(in)) {
			int[] cube = new int[24];
			for (int i = 0; i < 24; i++) {
				cube[i] = sc.nextInt();
			}

			//System.out.println("@@@@@@@");
			//printcube(cube);
			//System.out.println("@@@@@@@");
			// Face up
			if (facedone(cube, 1) && facedone(cube, 3)) {
				// Rotate face 1 to right
				rotateface1(cube);
				if (facedone(cube, 2) && facedone(cube, 4) && facedone(cube, 5) && facedone(cube, 6)) {
					out.print("YES");
					return;
				}
				// Rotate face 1 to left (with 2 more right turns)
				rotateface1(cube);
				rotateface1(cube);
				if (facedone(cube, 2) && facedone(cube, 4) && facedone(cube, 5) && facedone(cube, 6)) {
					out.print("YES");
					return;
				}
				// Reset
				rotateface1(cube);
			}
			if (facedone(cube, 2) && facedone(cube, 6)) {
				// Rotate face 2 to right
				rotateface2(cube);
				if (facedone(cube, 1) && facedone(cube, 3) && facedone(cube, 4) && facedone(cube, 5)) {
					out.print("YES");
					return;
				}
				// Rotate face 2 to left
				rotateface2(cube);
				rotateface2(cube);
				if (facedone(cube, 1) && facedone(cube, 3) && facedone(cube, 4) && facedone(cube, 5)) {
					out.print("YES");
					return;
				}
				rotateface2(cube);
			}
			if (facedone(cube, 4) && facedone(cube, 5)) {
				// Rotate face 5 to right
				rotateface4(cube);
				if (facedone(cube, 1) && facedone(cube, 2) && facedone(cube, 3) && facedone(cube, 6)) {
					out.print("YES");
					return;
				}
				// Rotate face 5 to left
				rotateface4(cube);
				rotateface4(cube);
				if (facedone(cube, 1) && facedone(cube, 2) && facedone(cube, 3) && facedone(cube, 6)) {
					out.print("YES");
					return;
				}
			}

			out.print("NO");
		}
	}

	private static void rotateface1(int[] cube) {
		int t1 = cube[20];
		int t2 = cube[21];
		cube[21] = cube[17];
		cube[20] = cube[16];
		cube[17] = cube[5];
		cube[16] = cube[4];
		cube[5] = cube[13];
		cube[4] = cube[12];
		cube[13] = t1;
		cube[12] = t2;
		//printcube(cube);
		return;
	}

	private static void rotateface2(int[] cube) {
		int t1 = cube[16];
		int t2 = cube[18];
		cube[16] = cube[9];
		cube[18] = cube[8];
		cube[9] = cube[15];
		cube[8] = cube[13];
		cube[15] = cube[2];
		cube[13] = cube[3];
		cube[2] = t1;
		cube[3] = t2;
		//printcube(cube);
		return;
	}

	private static void rotateface4(int[] cube) {
		int t1 = cube[23];
		int t2 = cube[21];
		cube[23] = cube[0];
		cube[21] = cube[2];
		cube[0] = cube[4];
		cube[2] = cube[6];
		cube[4] = cube[8];
		cube[6] = cube[10];
		cube[8] = t1;
		cube[10] = t2;
		
		//printcube(cube);
		return;
	}

	private static boolean facedone(int[] cube, int face) {
		int i = (face - 1) * 4;
		if (cube[i + 1] != cube[i]) return false;
		if (cube[i + 2] != cube[i]) return false;
		if (cube[i + 3] != cube[i]) return false;
		return true;
	}
	
	public static void printcube(int[] cube) {
		System.out.println("  " +cube[0]+cube[1]);
		System.out.println("  " +cube[2]+cube[3]);
		System.out.println("  " +cube[12]+cube[13]+cube[4]+cube[5]+cube[16]+cube[17]+cube[20]+cube[21]);
		System.out.println("  " +cube[14]+cube[15]+cube[6]+cube[7]+cube[18]+cube[19]+cube[22]+cube[23]);
		System.out.println("  " +cube[8]+cube[9]);
		System.out.println("  " +cube[10]+cube[11]);
		System.out.println();
	}

}