import java.util.Scanner;

public class Solution {
	public static boolean danzo(int num) {
		char[] s = String.valueOf(num).toCharArray();
		
		for(int i = 0; i<s.length - 1;i++) {
			if(s[i]>s[i+1]) {
				return false;
			}
		}		
		return true;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int tc = sc.nextInt();
		for(int t = 1; t<=tc; t++) {
			int N = sc.nextInt();
			int[] arr = new int[N];
			
			for(int i = 0; i<N; i++) {
				arr[i] = sc.nextInt();
			}
			
			int max = -1;
			
			for(int i = 0; i<N-1; i++) {
				for(int j = i+1; j<N; j++) {
					int ans = arr[i]*arr[j];
					if(ans > max) {
						if(danzo(ans)) max = ans;
					}
				}
			}
			System.out.println("#" + t + " " + max);
		}
		sc.close();
	}
}
