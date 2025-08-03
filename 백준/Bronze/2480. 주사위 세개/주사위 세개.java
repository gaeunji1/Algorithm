import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int result = 0;
		
		// 3개가 다 같을 때
		if (a == b && b==c && c==a) {
			result = 10000 + a * 1000;
		}
		// 2개만 같을 때
		else if(a == b && (a != c && b != c)){
			result = 1000 + a * 100;
		} else if(a == c && (b != a && b != c)){
			result = 1000 + a * 100;
		} else if(b == c && (a != b && a != c)) {
			result = 1000 + b * 100;
		}
		// 모두 다른 눈일 때
		else if(a!=b && b!=c && a!=c) {
			// a가 가장 클 때
			if( a>b && a>c) {
				result = a*100;
			}
			// b가 가장 클 때
			else if(b>c && b>a) {
				result = b*100;
			}
			// c가 가장 클 때
			else if(c>a && c>b) {
				result = c*100;
			}
		}
		
		System.out.println(result);
	}
}