import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 입력
		Scanner sc = new Scanner(System.in);
		
		// 정수 A, B
		int dan = sc.nextInt();
		
		for(int i = 1; i<10; i++) {
			System.out.println(dan+ " * "+i+ " = " + dan*i);
		}
	}
}
