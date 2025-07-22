import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 입력
		Scanner sc = new Scanner(System.in);
		
		// 정수 A, B
		int num = sc.nextInt();
		
		for(int i=1; i<num+1; i++) {
			for(int j=1; j<i+1 ; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}