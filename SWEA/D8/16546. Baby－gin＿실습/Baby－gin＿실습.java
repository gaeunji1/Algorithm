import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();

		for (int t = 1; t <= tc; t++) {
			// 입력
			// 6장의 숫자 입력받기
			String cards = sc.next();

			// 카드 숫자 받기
			int[] count = new int[10];
			// 6장
			for (int i = 0; i < 6; i++) {
				count[cards.charAt(i) - '0']++;
			}

			int triplet = 0;
			int run = 0;

			// 트리플 확인
			for (int i = 0; i < 10; i++) {
				while (count[i] >= 3) {
					count[i] -= 3;
					triplet++;
				}
			}

			// run 확인
			for (int i = 0; i < 8; i++) {
				while (count[i] > 0 && count[i + 1] > 0 && count[i + 2] > 0) {
					count[i]--;
					count[i + 1]--;
					count[i + 2]--;
					run++;
				}
			}

			// 결과 판정
			if (triplet + run == 2) {
				System.out.println("#" + t + " true");
			} else {
				System.out.println("#" + t + " false");
			}
		}
	}
}
