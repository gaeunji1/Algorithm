import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		int tripl = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
			tripl += (i * i * i);

		}
		System.out.println(sum);
		System.out.println(sum * sum);
		System.out.println(tripl);
	}
}
