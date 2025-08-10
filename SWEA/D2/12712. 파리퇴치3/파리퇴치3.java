import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		// 입력
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		for(int t = 1; t<=tc;t++) {
			
			// N 전체 배열 M 세기
			int N = sc.nextInt();
			int M = sc.nextInt();
			
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
			
			// 델타 좌상,우상,좌하,우하
			int[] dxr = {-1, -1, 1, 1};
			int[] dyr = {-1, 1, -1, 1};
			
			int maxCount =0;
			
			// 분사
			for(int i = 0; i<N; i++) {
				for(int j = 0; j<N ; j++) {
					int xCount = arr[i][j];
					int plusCount = arr[i][j];
					
					for(int d = 0; d<4; d++) {
						for(int m = 1; m < M ; m++) {
							// +로 분사
							int nx = i + dx[d] * m;
							int ny = j + dy[d] * m;
							
							if (nx >= 0 && nx < N && ny >= 0 && ny < N) {
								plusCount += arr[nx][ny];
							}
							
							// x로 분사
							int nxr = i + dxr[d] * m;
							int nyr = j + dyr[d] * m;
							
							if (nxr >= 0 && nxr < N && nyr >= 0 && nyr < N) {
								xCount += arr[nxr][nyr];
							}
							
						}
					}
					if(maxCount < plusCount) maxCount = plusCount;
					if(maxCount < xCount) maxCount = xCount;
					
					
				}
			}
			
			
			System.out.println("#" + t + " " + maxCount);
		}
		
	}
}