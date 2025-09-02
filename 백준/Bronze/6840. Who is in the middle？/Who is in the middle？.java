import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
		int[] arr = {a,b,c};
		
		int max = Math.max(a, Math.max(c, b));
		int min = Math.min(a, Math.min(c, b));
		
		for(int i = 0; i<3;i++) {
			if(arr[i] != max && arr[i] != min) {
				System.out.println(arr[i]);
			}
		}

	}
}
