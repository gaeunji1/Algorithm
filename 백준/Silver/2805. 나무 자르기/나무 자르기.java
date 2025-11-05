import java.util.Scanner;

public class Main {
	static int n;
	static int m;
	static int[] tree;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt(); // 나무의 수
		m = sc.nextInt(); // 가져가려는 나무의 수
		tree = new int[n];
		long hi = 0; // 제일 높은 나무
		for (int i = 0; i < n; i++) {
			tree[i] = sc.nextInt();
			if (hi < tree[i])
				hi = tree[i];
		}

		long getTree = 0; // 챙겨갈 나무 개수
		long ans = 0;
		long lo = 0;
		while (lo <= hi) {
			long mid = (hi + lo) / 2;
			getTree = cut(mid);
			if (getTree >= m) { // 충분 -> 높이를 올리자
				ans = mid;
				lo = mid + 1;
			} else {
				hi = mid - 1;
			}
		}
		System.out.println(ans);
	}

	static long cut(long mid) {
		long sum = 0;
		for (int i = 0; i < n; i++) {
			if (tree[i] > mid) {
				sum += (tree[i] - mid);
				if (sum >= m)
					break;
			}
		}
		return sum;
	}
}
