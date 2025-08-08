
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		
		for(int t = 1; t<=tc;t++) {
			int num = sc.nextInt();
			int[] arr = new int[num];
			
			for(int i = 0 ; i <num ; i++) {
				arr[i] = sc.nextInt();
			}
			
			int maxDrop = 0;
			for(int i = 0 ; i <num ; i++) {
				int drop = 0;
				for(int j = i+1; j<num ; j++){
					if(arr[i] > arr[j]) {
						drop++;
					}
				}
				if(drop > maxDrop) {
					maxDrop = drop;
				}
			}
			System.out.println("#" + t + " " +maxDrop);
		}
		
	}
}