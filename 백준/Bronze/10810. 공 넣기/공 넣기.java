import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] arr = new int[N];
		
		for(int t = 0; t<M; t++) {
			int i = sc.nextInt();
			int j = sc.nextInt();
			int k = sc.nextInt();
			
			for(int h =i-1;h<j;h++) {
				arr[h]=k;
			}
		}
		for(int t = 0; t<N;t++) {
			System.out.print(arr[t] + " ");
		}
	}
}
