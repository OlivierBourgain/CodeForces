package p81x;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 */
public class Main811D {
	public static void main(String[] args) {
		run(System.in, System.out);
	}

	public static class Pos {
		int x, y;

		public Pos(int x, int y) {
			this.x = x;
			this.y = y;
		}

		@Override
		public String toString() {
			return x + "/" + y;
		}
	}

	private static int INVERTED = 2;
	private static int NORMAL = 1;
	private static int UKNOWN = -1;

	public static void run(InputStream in, PrintStream out) {

		try (Scanner sc = new Scanner(in)) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			sc.nextLine();
			char[][] map = new char[n][m];
			Pos target = null;
			for (int i = 0; i < n; i++) {
				String s = sc.nextLine();
				for (int j = 0; j < m; j++) {
					map[i][j] = s.charAt(j);
					if (map[i][j] == 'F') {
						target = new Pos(i, j);
						map[i][j] = '.';
					}
				}
			}

			int ud = -1;
			int lr = -1;

			Pos me = new Pos(0, 0);

			while (true) {

				if (lr == UKNOWN && me.y == 0 && map[me.x][1] == '.') {
					out.println('R');
					int x = sc.nextInt() - 1;
					int y = sc.nextInt() - 1;
					if (y == 1) lr = NORMAL;
					else lr = INVERTED;
					me = new Pos(x, y);
				} else if (ud == UKNOWN && me.x == 0 && map[1][me.y] == '.') {
					out.println('D');
					int x = sc.nextInt() - 1;
					int y = sc.nextInt() - 1;
					if (x == 1) ud = NORMAL;
					else ud = INVERTED;
					me = new Pos(x, y);
				} else {
					char dir = getDirection(n, m, map, me, target);
					if (ud == INVERTED && dir == 'U') dir = 'D';
					else if (ud == INVERTED && dir == 'D') dir = 'U';
					else if (lr == INVERTED && dir == 'L') dir = 'R';
					else if (lr == INVERTED && dir == 'R') dir = 'L';
					out.println(dir);
					System.out.flush();

					int x = sc.nextInt();
					int y = sc.nextInt();
					if (x == -1) return;
					me = new Pos(x - 1, y - 1);
				}
				if (me.x == target.x && me.y == target.y) return;
			}

		}
	}

	private static char getDirection(int n, int m, char[][] map, Pos me, Pos target) {
		boolean[][] visited = new boolean[n][m];
		Pos[][] prev = new Pos[n][m];
		char[][] move = new char[n][m];
		Queue<Pos> queue = new LinkedList<>();
		queue.add(me);
		visited[me.x][me.y] = true;

		while (!queue.isEmpty()) {
			Pos p = queue.poll();

			if (p.x == target.x && p.y == target.y) break;

			if (p.x > 0 && map[p.x - 1][p.y] == '.' && !visited[p.x - 1][p.y]) {
				queue.add(new Pos(p.x - 1, p.y));
				prev[p.x - 1][p.y] = p;
				visited[p.x - 1][p.y] = true;
				move[p.x - 1][p.y] = 'U';
			}

			if (p.x < n - 1 && map[p.x + 1][p.y] == '.' && !visited[p.x + 1][p.y]) {
				queue.add(new Pos(p.x + 1, p.y));
				prev[p.x + 1][p.y] = p;
				visited[p.x + 1][p.y] = true;
				move[p.x + 1][p.y] = 'D';
			}
			if (p.y > 0 && map[p.x][p.y - 1] == '.' && !visited[p.x][p.y - 1]) {
				queue.add(new Pos(p.x, p.y - 1));
				prev[p.x][p.y - 1] = p;
				visited[p.x][p.y - 1] = true;
				move[p.x][p.y - 1] = 'L';
			}
			if (p.y < m - 1 && map[p.x][p.y + 1] == '.' && !visited[p.x][p.y + 1]) {
				queue.add(new Pos(p.x, p.y + 1));
				prev[p.x][p.y + 1] = p;
				visited[p.x][p.y + 1] = true;
				move[p.x][p.y + 1] = 'R';
			}
		}

		// Find 1st mv
		Pos p = target;
		// System.err.println(Arrays.deepToString(prev));
		while (true) {
			Pos previous = prev[p.x][p.y];
			// System.err.println("Previous of " + p + " is " + previous);
			if (previous.x == me.x && previous.y == me.y) { return move[p.x][p.y]; }
			p = previous;
		}

	}

}