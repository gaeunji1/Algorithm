import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int tc = sc.nextInt();
		for(int t = 1; t<=tc ; t++) {
			
			int len = sc.nextInt();
			String input = sc.next();
			
			int result = 0;
			int count = 0;
			
			for(int i = 0; i< len ; i++) {
				if(input.charAt(i) == '1') {
					count++;
					if(count >result) {
						result = count;
					}
				}
				else {
					count = 0;
				}
				
			}
			
			System.out.println("#" + t + " " + result);
			
			
			
		}
	}
}
