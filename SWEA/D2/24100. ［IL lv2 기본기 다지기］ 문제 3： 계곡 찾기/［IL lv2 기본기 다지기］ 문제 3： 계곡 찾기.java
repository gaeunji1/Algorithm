import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		// 입력
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		for(int t = 1; t<=tc;t++) {
			
			int N = sc.nextInt();
			
			// 배열 만들기
			int[][] arr = new int[N][N];
			for(int i = 0; i<N ; i++) {
				for(int j = 0; j<N ; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			
			// 델타 좌우상하
			int[] dx = {0,0,-1,1};
			int[] dy = {-1,1,0,0};
			
			// 계곡인지 확인
			int count = 0;
			for(int i =1; i<N-1; i++) {
				for(int j =1; j<N-1;j++) {
					boolean isValley = true;
					int now = arr[i][j];
					for(int k = 0; k<4;k++) {
						int nx = i + dx[k];
						int ny = j + dy[k];
						
						if(now >= arr[nx][ny]) {
							isValley = false;
							break;
						}
					}
					if(isValley) count++;
				}
			}
			System.out.println("#" + t + " "+count);
		}
		
	}
}
