import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static int n, m;
	static int[] a;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		m = sc.nextInt();
		for (int i = 0; i < m; i++) {
			int num = sc.nextInt();
			System.out.println(Arrays.binarySearch(a, num) >= 0 ? 1 : 0);
		}

	}
}
