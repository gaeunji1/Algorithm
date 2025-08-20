import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[] arr = new int[n];
		for(int i = 0; i< n; i++) {
			arr[i] = i+1;
		}
		
		for(int i = 0; i<m;i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			int temp = arr[x-1];
			arr[x-1] = arr[y-1];
			arr[y-1] = temp;
			
		}
		for(int i = 0; i<n; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
