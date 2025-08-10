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
			
			// 봉우리인지 확인
			int count = 0;
			for(int i =0; i<N; i++) {
				for(int j =0; j<N;j++) {
					boolean isPeak = true;
					int now = arr[i][j];
					for(int k = 0; k<4;k++) {
						int nx = i + dx[k];
						int ny = j + dy[k];
						
						// 가장자리를 만나도 무시하고 진행해라!
						if(nx < 0 || ny < 0 || nx >= N || ny >= N) continue;
						
						if(now <= arr[nx][ny]) {
							isPeak = false;
							break;
						} 
					}
					if(isPeak) count++;
				}
			}
			System.out.println("#" + t + " "+count);
		}
		
	}
}
