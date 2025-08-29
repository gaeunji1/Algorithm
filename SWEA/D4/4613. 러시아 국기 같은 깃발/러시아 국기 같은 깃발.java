import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int tc = 1; tc <= T; tc++) {
            int N = sc.nextInt(); // 행
            int M = sc.nextInt(); 

            String[] board = new String[N];
            for (int i = 0; i < N; i++) board[i] = sc.next();

            int mn = N * M; // 최댓값으로 초기화
            // 흰(W): [0..x], 파(B): [x+1..y], 빨(R): [y+1..N-1]
            for (int x = 0; x < N - 2; x++) {
                for (int y = x + 1; y < N - 1; y++) {
                    int cnt = 0;

                    // W 영역
                    for (int r = 0; r <= x; r++) {
                        String row = board[r];
                        for (int c = 0; c < M; c++) if (row.charAt(c) != 'W') cnt++;
                    }
                    // B 영역
                    for (int r = x + 1; r <= y; r++) {
                        String row = board[r];
                        for (int c = 0; c < M; c++) if (row.charAt(c) != 'B') cnt++;
                    }
                    // R 영역
                    for (int r = y + 1; r < N; r++) {
                        String row = board[r];
                        for (int c = 0; c < M; c++) if (row.charAt(c) != 'R') cnt++;
                    }

                    if (cnt < mn) mn = cnt;
                }
            }

            System.out.println("#" + tc + " " + mn);
        }
        sc.close();
    }
}
