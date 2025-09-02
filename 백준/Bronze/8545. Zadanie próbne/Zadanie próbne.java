import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		char[] ch = str.toCharArray();
		for(int i=2; i>=0; i--) {
			System.out.print(ch[i]);
		}
	}
}
