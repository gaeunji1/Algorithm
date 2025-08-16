import java.util.Scanner;

public class Solution {
	static final int[] dx = { 0, 1, 1, -1 };
	static final int[] dy = { 1, 0, 1, 1 };

	public static boolean hasFive(char[][] arr, int N) {
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (arr[i][j] != 'o')
					continue;
				for (int d = 0; d < 4; d++) {
					int cnt = 1;
					int nx = i, ny = j;
					for (int k = 1; k < 5; k++) {
						nx += dx[d];
						ny += dy[d];
						if (nx < 0 || nx >= N || ny < 0 || ny >= N)
							break;
						if (arr[nx][ny] != 'o')
							break;
						cnt++;
					}
					if (cnt >= 5)
						return true;
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = Integer.parseInt(sc.nextLine());


		for (int t = 1; t <= tc; t++) {
			int N = Integer.parseInt(sc.nextLine());


			char[][] arr = new char[N][N];
			for (int i = 0; i < N; i++) {
				String line = sc.nextLine();
				for (int j = 0; j < N; j++) {
					arr[i][j] = line.charAt(j);
				}
			}

			boolean ok = hasFive(arr, N);
			if (ok == true) {
				System.out.println("#" + t + " " + "YES");
			} else {
				System.out.println("#" + t + " " + "NO");

			}
		}
	}
}