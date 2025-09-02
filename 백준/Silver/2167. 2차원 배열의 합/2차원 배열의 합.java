import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(), m = sc.nextInt();
		int[][] arr = new int[n][m];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		int k = sc.nextInt();
		for (int t = 0; t < k; t++) {
			int i = sc.nextInt(), j = sc.nextInt(), x = sc.nextInt(), y = sc.nextInt();

			int sum = 0;

			for (int row = i - 1; row <= x - 1; row++) {
				for (int col = j - 1; col <= y - 1; col++) {
					sum += arr[row][col];
				}
			}
			System.out.println(sum);
		}
	}
}
