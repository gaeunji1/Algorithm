import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n];
		for(int i =0; i<n;i++) {
			arr[i] = i+1;
		}
		
		// 뒤집기
		for(int i = 0; i < m; i++) {
			int start = sc.nextInt() -1;
			int end = sc.nextInt() -1;
			
			while(start < end) {
				int temp = arr[start];
				arr[start] = arr[end];
				arr[end] = temp;
				start++;
				end--;
			}
		}
		
		for(int i = 0; i<n;i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
