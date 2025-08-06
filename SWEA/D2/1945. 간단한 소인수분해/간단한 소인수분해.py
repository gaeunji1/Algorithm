
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		for(int i = 1 ; i<=tc ; i++) {
			int number = sc.nextInt();
			int num2 = 0;
			int num3 = 0;
			int num5 = 0;
			int num7 = 0;
			int num11 = 0;
			// 2의 배수인지 확인
			while(number % 2 == 0) {
				number/=2;
				num2++;
			}
			// 3의 배수인지 확인
			while(number % 3 == 0) {
				number/=3;
				num3++;
			}
			// 5의 배수인지 확인
			while(number % 5 == 0) {
				number/=5;
				num5++;
			}
			// 7의 배수인지 확인
			while(number % 7 == 0) {
				number/=7;
				num7++;
			}
			// 11의 배수인지 확인
			while(number % 11 == 0) {
				number/=11;
				num11++;
			}
			System.out.println("#" + i + " " +num2 +" "+ num3+" "+ num5+" "+ num7+" "+ num11);
		}
		
		
	}
}
