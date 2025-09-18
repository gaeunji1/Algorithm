import java.util.*;

public class Solution {
	static final int N = 16;
	static int[][] maze;
	static boolean[][] visited;
	static final int[][] DIRS = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (int t = 1; t <= 10; t++) { // 총 10개 테스트케이스
			sc.nextInt(); // 테스트케이스 번호(입력 형식상 존재) 무시
			sc.nextLine(); // 개행 소거

			maze = new int[N][N];
			visited = new boolean[N][N];

			int sr = -1, sc2 = -1; // start r,c
			for (int i = 0; i < N; i++) {
				String line = sc.nextLine();
				for (int j = 0; j < N; j++) {
					maze[i][j] = line.charAt(j) - '0';
					if (maze[i][j] == 2) {
						sr = i;
						sc2 = j;
					}
				}
			}

			int ans = bfs(sr, sc2) ? 1 : 0;
			System.out.println("#" + t + " " + ans);
		}
	}

	static boolean bfs(int sr, int sc2) {
		ArrayDeque<int[]> q = new ArrayDeque<>();
		visited[sr][sc2] = true;
		q.offer(new int[] { sr, sc2 });

		while (!q.isEmpty()) {
			int[] cur = q.poll();
			int r = cur[0], c = cur[1];

			for (int[] d : DIRS) {
				int nr = r + d[0], nc = c + d[1];
				if (!in(nr, nc) || visited[nr][nc])
					continue;
				if (maze[nr][nc] == 1)
					continue; // 벽

				if (maze[nr][nc] == 3)
					return true; // 도착 발견
				visited[nr][nc] = true;
				q.offer(new int[] { nr, nc });
			}
		}
		return false;
	}

	static boolean in(int r, int c) {
		return 0 <= r && r < N && 0 <= c && c < N;
	}
}
