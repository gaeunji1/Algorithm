
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int tc = 1; tc<=10; tc++) {
			sc.nextInt();

			// 배열 만들기
			int[][] arr = new int[100][100];
			for (int i = 0; i < 100; i++) {
				for (int j = 0; j < 100; j++) {
					arr[i][j] = sc.nextInt();
				}
			}

			int maxInt = 0;
			
			// 가로 합
			for (int i = 0; i < 100; i++) {
				int sum = 0;
				for (int j = 0; j < 100; j++) {
					sum += arr[i][j];
				}
				if(sum>maxInt) maxInt = sum;
			}
			// 세로 합
			for (int i = 0; i < 100; i++) {
				int sum = 0;
				for (int j = 0; j < 100; j++) {
					sum += arr[j][i];
				}
				if(sum>maxInt) maxInt = sum;
			}
			// 대각선(위 -> 아래) 합
			int sum = 0;
			for (int i = 0; i < 100; i++) {
				sum += arr[i][i];
				if(sum>maxInt) maxInt = sum;
			}
			sum = 0;
			// 대각선 (아래 -> 위) 합
			for (int i = 0; i < 100; i++) {
				sum += arr[99-i][i];
				if(sum>maxInt) maxInt = sum;
			}
			System.out.println("#"+ tc +" " +maxInt);
		}
	}
}
