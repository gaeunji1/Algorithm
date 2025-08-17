import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        for (int t = 1; t <= tc; t++) {
            int N = sc.nextInt();
            int K = sc.nextInt();

            int[][] arr = new int[N][N];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }

            int result = 0;

            // 가로 스캔
            for (int i = 0; i < N; i++) {
                int len = 0;
                for (int j = 0; j < N; j++) {
                    if (arr[i][j] == 1) len++;
                    if (arr[i][j] == 0 || j == N - 1) { 
                        if (arr[i][j] == 0) {
                            if (len == K) result++;
                            len = 0;
                        } else { // 끝에 도달했을 때
                            if (len == K) result++;
                            // 다음 행로 넘어가므로 len 초기화 불필요
                        }
                    }
                }
            }

            // 세로 스캔
            for (int j = 0; j < N; j++) {
                int len = 0;
                for (int i = 0; i < N; i++) {
                    if (arr[i][j] == 1) len++;
                    if (arr[i][j] == 0 || i == N - 1) {
                        if (arr[i][j] == 0) {
                            if (len == K) result++;
                            len = 0;
                        } else {
                            if (len == K) result++;
                        }
                    }
                }
            }

            System.out.println("#" + t + " " + result);
        }
    }
}
