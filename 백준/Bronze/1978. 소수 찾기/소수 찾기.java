import java.util.Scanner;

public class Main {
	static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		int count =0;
		
		for(int i = 0; i<n; i++) {
			int num = sc.nextInt();
			if(isPrime(num)) count++;
		}
		
		System.out.println(count);
	}
}
