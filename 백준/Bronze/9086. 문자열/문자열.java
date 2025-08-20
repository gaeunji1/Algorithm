import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		for(int t = 0; t<tc; t++) {
			String str = sc.next();
			int len = str.length();
			
			char a = str.charAt(0);
			char b = str.charAt(len-1);
			
			System.out.println(a+"" +b);
		}
	}
}
