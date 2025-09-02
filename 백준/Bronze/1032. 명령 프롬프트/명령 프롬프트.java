import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		String str1 = sc.next();
		int len = str1.length();
		char[] ch = str1.toCharArray();
//		System.out.println(Arrays.toString(ch));

		for (int i = 0; i < n - 1; i++) {
			String compare = sc.next();
			char[] comp = compare.toCharArray();
//			System.out.println(Arrays.toString(comp));

			for (int j = 0; j < len; j++) {
				if (ch[j] != comp[j]) {
					ch[j] = '?';
				}
			}

//			System.out.println(Arrays.toString(ch));
		}
		for (int i = 0; i < len; i++) {
			System.out.print(ch[i]);
		}

	}
}
