import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static int x, y, n;
	static boolean[] visit;
	static int[] parent;
	static ArrayList<ArrayList<Integer>> arr = new ArrayList<>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();

		visit = new boolean[n + 1];
		parent = new int[n + 1];

		for (int i = 0; i <= n; i++) {
			arr.add(new ArrayList<>());
		}

		for (int i = 0; i < n - 1; i++) {
			x = sc.nextInt();
			y = sc.nextInt();
			arr.get(x).add(y);
			arr.get(y).add(x);
		}
		sc.close();
		
		DFS(1);
		
		for (int i = 2; i <= n; i++) {
			System.out.println(parent[i]);
		}

	}

	public static void DFS(int a) {
		visit[a] = true;
		
		for (int next : arr.get(a)) {
            if (!visit[next]) {
                parent[next] = a; 
                DFS(next);
            }
        }
	}
}
