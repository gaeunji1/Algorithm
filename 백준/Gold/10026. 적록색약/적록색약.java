import java.util.Scanner;

public class Main {
	static int n;
	static char[][] picture;
	static boolean[][] visited;
	static int[][] dirs = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		sc.nextLine();

		picture = new char[n][n];
		visited = new boolean[n][n];

		for (int i = 0; i < n; i++) {
			String str = sc.nextLine();
			for (int j = 0; j < n; j++) {
				picture[i][j] = str.charAt(j);
			}
		} // 세팅하기

		// 1. 일반인
		int normalCount = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (!visited[i][j]) {
					dfs(i, j, picture[i][j]);
					normalCount++;
				}
			}
		}

		visited = new boolean[n][n];
		// 2. 적록색약
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (picture[i][j] == 'R') {
					picture[i][j] = 'G';
				}
			}
		}

		int noRedCount = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (!visited[i][j]) {
					dfs(i, j, picture[i][j]);
					noRedCount++;
				}
			}
		}
		System.out.println(normalCount + " " + noRedCount);
	}

	public static void dfs(int r, int c, char color) {
		visited[r][c] = true;
		for (int d = 0; d < 4; d++) {
			int nr = r + dirs[d][0];
			int nc = c + dirs[d][1];
			if (nr < 0 || nc < 0 || nr >= n || nc >= n || visited[nr][nc]) {
				continue;
			}
			if (!visited[nr][nc] && picture[nr][nc] == color) {
				dfs(nr, nc, color);
			}
		}
	}
}
