import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine().trim();
		int len = str.length();
		int count = 1;
		char[] arr = str.toCharArray();
		if (str.isEmpty()) {
		    System.out.println(0);
		} else {
			
			for(int i = 0; i<len;i++) {
				if(arr[i] == ' ') {
					count++;
				}
			}
			System.out.println(count);
		}
	}
}