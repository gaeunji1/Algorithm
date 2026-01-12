import java.util.Scanner;

public class Main {
	public static void main(String agrs[]) {
		Scanner sc = new Scanner(System.in);
		
		int start = 0;
		while(true) {
			String a = sc.nextLine();
			if(a.equals("0")) break;
			start++;
		}
		for(int i = 1; i <= start; i++) {
			System.out.println("Case " + i + ": Sorting... done!");
		}
	}
}