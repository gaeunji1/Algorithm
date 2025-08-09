import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		// 입력
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		
		for(int t = 1; t<=tc;t++){

			int N = sc.nextInt();
			int[][] arr = new int[N][N];
			
			// 배열 입력
			for (int i = 0; i < N; i++) {
	            for (int j = 0; j < N; j++) {
	                arr[i][j] = sc.nextInt();
	            }
	        }
			
			int count = 0;
			
			// 왼 = dx[0] dy[0]
			// 오 = dx[1] dy[1]
			// 아 = dx[2] dy[2]
			// 위 = dx[3] dy[4]
			int[] dx = {0,0,1,-1};
			int[] dy = {-1,1,0,0};
			
			
			
			
			for(int x=1; x<N-1; x++) {
				for(int y = 1; y<N-1; y++) {
					int h = arr[x][y];
					boolean vally = true;
					for(int d = 0; d<4;d++) {
						int nx = x +dx[d];
						int ny = y +dy[d];
						
						if(arr[nx][ny]<=h) {
							vally=false;
							break;
						}
					}
					if (vally) count++;
					
				}
			}
			System.out.println("#" + t+ " " +count);
		}
		
	}
}
