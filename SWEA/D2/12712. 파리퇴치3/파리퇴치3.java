
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		
		for(int t=1; t<=tc;t++) {
			int N = sc.nextInt(), M=sc.nextInt();
			int[][] arr = new int[N][N];
			for(int i = 0; i<N;i++) {
				for(int j = 0; j<N;j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			
			// 상하좌우
			int[] dx = {-1,1,0,0};
			int[] dy = {0,0,-1,1};
			// 좌상 우상 우하 좌하
			int[] dxr = {-1,-1,1,1};
			int[] dyr = {-1,1,1,-1};
			
			int maxFly = 0, fly = 0;
			
			for(int i = 0; i<N;i++) {
				for(int j = 0; j<N; j++) {
					int flyPlus =arr[i][j];
					for(int x=0;x<4;x++) {
						for(int y = 1;y<M;y++) {
							int nx = i+dx[x]*y;
							int ny = j + dy[x]*y;
							if(nx>= 0 && nx<N&&ny>= 0&&ny<N) {
								flyPlus += arr[nx][ny];
							}
						}
					}
					int flyX =arr[i][j];
					for(int x=0;x<4;x++) {
						for(int y = 1;y<M;y++) {
							int nx = i+dxr[x]*y;
							int ny = j + dyr[x]*y;
							if(nx>= 0 && nx<N&&ny>= 0&&ny<N) {
								flyX += arr[nx][ny];
							}
						}
					}
					
					if(maxFly<flyPlus) {
						maxFly = flyPlus;
					}
					if(maxFly < flyX) {
						maxFly = flyX;
					}
				}
			}
			System.out.println("#" + t+" "+maxFly);
		}
			
		}
		
	
}
