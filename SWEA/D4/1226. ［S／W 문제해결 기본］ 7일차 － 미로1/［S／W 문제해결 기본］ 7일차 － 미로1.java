import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Solution {
	static int n;
	static int[][] maze;
	static boolean[][] visited;
	static int result;
	static int[][] dirs = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = 10;
		for (int t = 1; t <= tc; t++) {
			n = 16;
			sc.nextLine();
			maze = new int[n][n];
			visited = new boolean[n][n];

			int r = 0, c = 0;

			for (int i = 0; i < n; i++) {
				String str = sc.nextLine();
				for (int j = 0; j < n; j++) {
					maze[i][j] = str.charAt(j) - '0';

					if (maze[i][j] == 2) {
						r = i;
						c = j;
					}
				}
			}
			if (bfs(r, c) == 0) {
				result = 0;
			} else {
				result = 1;
			}
			System.out.println("#" + t + " " + result);
		}
	}

	public static int bfs(int x, int y) {
		Queue<int[]> queue = new ArrayDeque<>();
		visited[x][y] = true;

		queue.add(new int[] { x, y, 0 });

		while (!queue.isEmpty()) {
			int[] cord = queue.poll();

			int r = cord[0];
			int c = cord[1];
			int dist = cord[2];

			for (int d = 0; d < 4; d++) {
				int nr = r + dirs[d][0];
				int nc = c + dirs[d][1];

				if (nr < 0 || nc < 0 || nr >= n || nc >= n || visited[nr][nc] || maze[nr][nc] == 1) {
					continue;
				}
				if (maze[nr][nc] == 3) {
					return dist;
				}
				visited[nr][nc] = true;
				queue.add(new int[] { nr, nc, dist + 1 });
			}
		}

		return 0;
	}
}
