import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int answer = -1;
		int five = n / 5;

		for (int i = five; i >= 0; i--) {
			int remain = n - 5 * i;
			if (remain % 3 == 0) {
				int three = remain / 3;
				answer = i + three;
				break;
			}
		}

		System.out.println(answer);

	}
}