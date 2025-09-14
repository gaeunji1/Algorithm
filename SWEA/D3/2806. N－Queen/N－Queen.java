import java.util.Scanner;

public class Solution {
	static int n, count;
	static int[] colPos;

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();

		for (int t = 1; t <= tc; t++) {
			n = sc.nextInt();
			colPos = new int[n];
			count = 0;

			dfs(0);

			// 출력 포맷 문제에 맞춰 조정
			// 예: SWEA 스타일 -> "#t count"
			// 백준이면 그냥 count만
			System.out.println("#" + t + " " + count);
		}
	}

	static void dfs(int row) {
		if (row == n) {
			count++;
			return;
		}
		for (int c = 0; c < n; c++) {
			colPos[row] = c;
			if (ok(row))
				dfs(row + 1);
		}
	}

	static boolean ok(int row) {
		for (int r = 0; r < row; r++) {
			if (colPos[r] == colPos[row])
				return false;
			if (Math.abs(row - r) == Math.abs(colPos[row] - colPos[r]))
				return false;
		}
		return true;
	}
}