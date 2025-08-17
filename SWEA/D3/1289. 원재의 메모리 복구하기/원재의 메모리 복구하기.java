import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		
		for(int t = 1; t<=tc;t++) {
			String memory = sc.next();
			char now = '0';
			int count = 0;
			
			for(int i = 0; i<memory.length();i++) {
				if(memory.charAt(i) != now) {
					count++;
					now = memory.charAt(i);
				}
			}
			System.out.println("#" + t + " " + count);
		}
	}
}