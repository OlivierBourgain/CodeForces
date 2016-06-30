package p67x;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

public class Main676D {

	protected static Map<Character, Character> rotation = new HashMap<>();
	static {
		rotation.put('+', '+');
		rotation.put('-', '|');
		rotation.put('|', '-');
		rotation.put('^', '>');
		rotation.put('>', 'v');
		rotation.put('<', '^');
		rotation.put('v', '<');
		rotation.put('L', 'U');
		rotation.put('R', 'D');
		rotation.put('U', 'R');
		rotation.put('D', 'L');
		rotation.put('*', '*');
	}

	public static class Pos {
		int x, y, z;
		int dist = 0;

		public Pos(int x, int y, int z) {
			this.x = x;
			this.y = y;
			this.z = z;
		}

		@Override
		public String toString() {
			return "" + x + "/" + y + "/" + z;
		}
	}

	public static void main(String[] args) {
		// Use the Scanner class
		try (Scanner sc = new Scanner(System.in)) {

			int n = sc.nextInt();
			int m = sc.nextInt();
			sc.nextLine();
			char[][][] tab = new char[n][m][4];
			for (int i = 0; i < n; i++) {
				String s = sc.nextLine();
				for (int j = 0; j < s.length(); j++) {
					tab[i][j][0] = s.charAt(j);
					tab[i][j][1] = rotation.get(tab[i][j][0]);
					tab[i][j][2] = rotation.get(tab[i][j][1]);
					tab[i][j][3] = rotation.get(tab[i][j][2]);
				}
			}

			int xt = sc.nextInt() - 1;
			int yt = sc.nextInt() - 1;
			int zt = 0;

			Pos post = new Pos(xt, yt, zt);
			int xm = sc.nextInt() - 1;
			int ym = sc.nextInt() - 1;
			int zm = 0;

			Pos posm = new Pos(xm, ym, zm);

			if (xt == xm && yt == ym) {
				System.out.println("0");
				return;
			}

			int res = go(tab, post, posm);
			System.out.println(res);
		}
	}

	protected static int go(char[][][] t, Pos start, Pos target) {
		// System.out.println("====================");
		Deque<Pos> tovisit = new LinkedList<>();
		boolean[][][] visited = new boolean[t.length][t[0].length][4];

		tovisit.add(start);
		visited[start.x][start.y][start.z] = true;

		while (!tovisit.isEmpty()) {
			Pos p = tovisit.removeFirst();
			// System.out.println("Visiting " + p + " " + t[p.x][p.y][p.z] +
			// " at dist " + p.dist);
			if (p.x == target.x && p.y == target.y) {
				// System.out.println("Found");
				return p.dist;
			}

			// Rotate
			int z = (p.z + 1) % 4;
			if (!visited[p.x][p.y][z]) {
				Pos q = new Pos(p.x, p.y, z);
				visited[p.x][p.y][z] = true;
				q.dist = p.dist + 1;
				tovisit.add(q);
			}

			// Going up
			if (p.x > 0 && doorUp(t[p.x][p.y][p.z]) && doorDown(t[p.x - 1][p.y][p.z]) && !visited[p.x - 1][p.y][p.z]) {
				Pos q = new Pos(p.x - 1, p.y, p.z);
				visited[p.x - 1][p.y][p.z] = true;
				q.dist = p.dist + 1;
				tovisit.add(q);
			}

			// Going down
			if (p.x < t.length - 1 && doorDown(t[p.x][p.y][p.z]) && doorUp(t[p.x + 1][p.y][p.z]) && !visited[p.x + 1][p.y][p.z]) {
				Pos q = new Pos(p.x + 1, p.y, p.z);
				visited[p.x + 1][p.y][p.z] = true;
				q.dist = p.dist + 1;
				tovisit.add(q);
			}

			// Going left
			if (p.y > 0 && doorLeft(t[p.x][p.y][p.z]) && doorRight(t[p.x][p.y - 1][p.z]) && !visited[p.x][p.y - 1][p.z]) {
				Pos q = new Pos(p.x, p.y - 1, p.z);
				visited[p.x][p.y - 1][p.z] = true;
				q.dist = p.dist + 1;
				tovisit.add(q);
			}

			// Going right
			if (p.y < t[0].length - 1 && doorRight(t[p.x][p.y][p.z]) && doorLeft(t[p.x][p.y + 1][p.z]) && !visited[p.x][p.y + 1][p.z]) {
				Pos q = new Pos(p.x, p.y + 1, p.z);
				visited[p.x][p.y + 1][p.z] = true;
				q.dist = p.dist + 1;
				tovisit.add(q);
			}

		}
		// System.out.println("No path found");
		return -1;
	}

	public static boolean doorUp(char c) {
		switch (c) {
		case '+':
		case '|':
		case '^':
		case 'R':
		case 'L':
		case 'D':
			return true;
		}
		return false;
	}

	public static boolean doorRight(char c) {
		switch (c) {
		case '+':
		case '-':
		case '>':
		case 'U':
		case 'L':
		case 'D':
			return true;
		}
		return false;
	}

	public static boolean doorDown(char c) {
		switch (c) {
		case '+':
		case '|':
		case 'v':
		case 'R':
		case 'U':
		case 'L':
			return true;
		}
		return false;
	}

	public static boolean doorLeft(char c) {
		switch (c) {
		case '+':
		case '-':
		case '<':
		case 'R':
		case 'U':
		case 'D':
			return true;
		}
		return false;
	}

}