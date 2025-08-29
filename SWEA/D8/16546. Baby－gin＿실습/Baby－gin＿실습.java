import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	public static boolean run(int[] arr) {
		if (arr[0] == arr[1] && arr[1] == arr[2]) {
			return true;
		}
		return false;
	}

	public static boolean triplet(int[] arr) {
		Arrays.sort(arr);
		if (arr[1] - arr[0] == 1 && arr[2] - arr[1] == 1) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		for (int t = 1; t <= tc; t++) {
			String str = sc.next();

			int[] arr = new int[6];
			for (int i = 0; i < 6; i++) {
				arr[i] = str.charAt(i) - '0';
			}

			int[] firstArr = new int[3];
			int[] secondArr = new int[3];

			boolean result = false;

			for (int i = 0; i < 6; i++) {
				for (int j = i + 1; j < 6; j++) {
					for (int k = j + 1; k < 6; k++) {
						firstArr[0] = arr[i];
						firstArr[1] = arr[j];
						firstArr[2] = arr[k];

						int idx = 0;
						for (int x = 0; x < 6; x++) {
							if (x != i && x != j && x != k) {
								secondArr[idx++] = arr[x];
							}
						}
						if (run(firstArr) || triplet(firstArr)) {
							if (run(secondArr) || triplet(secondArr)) {
								result = true;
							}
						}

					}
				}
			}

			if (result) {
				System.out.println("#" + t + " true");
			} else {
				System.out.println("#" + t + " false");
			}
		}

	}
}
