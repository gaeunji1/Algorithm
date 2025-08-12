import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		StringBuilder sb = new StringBuilder();

		for (int i = 1; i <= length; i++) {
			String str = "";
			boolean isClap = false;

			int current = i;
			// 3,6,9 판별
			while (current > 0) {
				int d = current % 10;

				if (d != 0 && d % 3 == 0) {
					isClap = true;
					str += "-";
				}
				current = current / 10;
			}
			if (isClap)
				System.out.print(str + " ");
			else
				System.out.print(i + " ");
		}
	}
}