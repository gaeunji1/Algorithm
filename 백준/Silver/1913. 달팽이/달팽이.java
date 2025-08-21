import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());
        int target = Integer.parseInt(br.readLine().trim());

        int[][] a = new int[N][N];

        // 시작: 중앙 (1부터 채움)
        int r = N / 2, c = N / 2;
        int num = 1;
        a[r][c] = num;

        int tr = r + 1, tc = c + 1; // 결과 좌표(1-index)
        if (target == 1) { tr = r + 1; tc = c + 1; }

        int step = 1; // 이동 칸 수 (1,1,2,2,3,3,...)
        // 방향: ↑, →, ↓, ←
        int[] dr = {-1, 0, 1, 0};
        int[] dc = { 0, 1, 0,-1};

        outer:
        while (num < N * N) {
            // ↑ step번
            for (int i = 0; i < step && num < N*N; i++) {
                r += dr[0]; c += dc[0];
                a[r][c] = ++num;
                if (num == target) { tr = r + 1; tc = c + 1; }
            }
            // → step번
            for (int i = 0; i < step && num < N*N; i++) {
                r += dr[1]; c += dc[1];
                a[r][c] = ++num;
                if (num == target) { tr = r + 1; tc = c + 1; }
            }
            step++;

            // ↓ step번
            for (int i = 0; i < step && num < N*N; i++) {
                r += dr[2]; c += dc[2];
                a[r][c] = ++num;
                if (num == target) { tr = r + 1; tc = c + 1; }
            }
            // ← step번
            for (int i = 0; i < step && num < N*N; i++) {
                r += dr[3]; c += dc[3];
                a[r][c] = ++num;
                if (num == target) { tr = r + 1; tc = c + 1; }
            }
            step++;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                sb.append(a[i][j]).append(' ');
            }
            sb.append('\n');
        }
        sb.append(tr).append(' ').append(tc).append('\n');
        System.out.print(sb.toString());
    }
}
