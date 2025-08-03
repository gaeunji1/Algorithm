import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for(int i=0 ; i< num;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.print("Case #");
			System.out.print(i+1);
			System.out.print(": ");
			System.out.println(a + " + " + b +" = " + (a+b));
		}
	}
}