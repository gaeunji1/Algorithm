import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long min = sc.nextLong();
		long max = sc.nextLong();

		int size = (int) (max - min + 1);
		boolean[] check = new boolean[size];

		// 2) 제곱수 i * i 제거
		for (long i = 2; i * i <= max; i++) {
			long pow = i * i; // 제거해야 하는 제곱수

			long start = ((min + pow - 1) / pow) * pow; // min 이상에서 pow(제곱수)로 나누어떨어지는 첫 번째 숫자.
			for (long x = start; x <= max; x += pow) {
				check[(int) (x - min)] = true;
			}
		}
		int count = 0;
		for (int i = 0; i < size; i++) {
			if (!check[i]) {
				count++;
			}
		}
		System.out.println(count);
	}

}
