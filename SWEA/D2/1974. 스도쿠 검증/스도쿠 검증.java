import java.util.Scanner;

public class Solution {
	static int[][] stocku = new int[9][9];
	static boolean isStock;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int tc = sc.nextInt();
		for (int t = 1; t <= tc; t++) {

			isStock = true;

			for (int i = 0; i < 9; i++) {
				for (int j = 0; j < 9; j++) {
					stocku[i][j] = sc.nextInt();
				}
			}
			boolean ok = isRow() && isColumn() && isSquare();
			System.out.println("#" + t + " " + (ok ? 1 : 0));
		}
	}

	public static boolean isRow() {
		for (int r = 0; r < 9; r++) {
			boolean[] seen = new boolean[10];
			for (int c = 0; c < 9; c++) {
				int v = stocku[r][c];
				if (seen[v])
					return false;
				seen[v] = true;
			}
		}
		return true;
	}

	public static boolean isColumn() {
		for (int r = 0; r < 9; r++) {
			boolean[] seen = new boolean[10];
			for (int c = 0; c < 9; c++) {
				int v = stocku[c][r];
				if (seen[v])
					return false;
				seen[v] = true;
			}
		}
		return true;
	}

	public static boolean isSquare() {
		for (int sr = 0; sr < 9; sr += 3) { // square row start
			for (int sc = 0; sc < 9; sc += 3) { // square col start
				boolean[] seen = new boolean[10];
				for (int r = sr; r < sr + 3; r++) {
					for (int c = sc; c < sc + 3; c++) {
						int v = stocku[r][c];
						if (seen[v])
							return false;
						seen[v] = true;
					}
				}
			}
		}
		return true;
	}
}
