import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 입력
		Scanner sc = new Scanner(System.in);
		
		// 정수 A, B
		int num = sc.nextInt();
		
		for(int i=0;i<num;i++) {
			for(int k=0; k<i;k++) {
				System.out.print(" ");
			}
			for(int j=num; j>i ; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}