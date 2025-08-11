
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		for(int t = 1; t<=tc; t++) {
			int N = sc.nextInt(), M = sc.nextInt();
			String str = sc.next();
			
			boolean found = false;
			
			for(int i = 0; i<= N-M;i++) {
				StringBuilder sb = new StringBuilder();
				for(int j = 0; j<M; j++) {
					sb.append(str.charAt(i+j));
				}
				String origin = sb.toString();
				String reverse = new StringBuilder(origin).reverse().toString();
				if(origin.equals(reverse)) {
					System.out.println("#" + t + " " + sb);
					found = true;
					break;
				}
			}
			if(!found) System.out.println("#" + t + " NONE");
		}
		
	}
}
