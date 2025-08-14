import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int tc = Integer.parseInt(sc.nextLine());

		for (int t = 1; t <= tc; t++) {
			int count = 0;
			char[] arr = sc.nextLine().toCharArray();

			int len = arr.length;
			for (int i = 0; i < len - 1; i++) {
				if (arr[i] == '(') {
					if (arr[i + 1] == ')' || arr[i + 1] == '|') {
						count++;
						arr[i + 1] = '_';
					}
				} else if (arr[i] == '|') {
					if (arr[i + 1] == ')') {
						count++;
						arr[i + 1] = '_';
					}
				}
			}
			System.out.println("#" + t + " " + count);
		}
	}
}