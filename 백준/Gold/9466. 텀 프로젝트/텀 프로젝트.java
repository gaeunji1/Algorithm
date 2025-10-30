import java.util.Scanner;

public class Main {
	static int[] student;
	static boolean[] done;
	static boolean[] visited;
	static int count; // 팀에 속한 학생 수

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int tc = sc.nextInt();
		for (int t = 1; t <= tc; t++) {
			int n = sc.nextInt();

			student = new int[n + 1];
			done = new boolean[n + 1];
			visited = new boolean[n + 1];
			count = 0;

			for (int i = 1; i <= n; i++) {
				student[i] = sc.nextInt();
			}
			for (int i = 1; i <= n; i++) {
				if (!done[i]) {
					dfs(i);
				}
			}
			System.out.println(n - count);
		}
	}

	static void dfs(int now) {
		visited[now] = true;
		int next = student[now];

		if (!visited[next]) {
			dfs(next);
		} else if (!done[next]) {
			count++;
			for (int i = next; i != now; i = student[i]) {
				count++;
			}
		}
		done[now] = true;
	}
}
