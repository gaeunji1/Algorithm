import java.util.Scanner;

public class Solution {
    static int[][] hike;
    static int[][] dp;
    static final int[][] dirs = { {-1,0}, {1,0}, {0,-1}, {0,1} };
    static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        for (int t = 1; t <= tc; t++) {
            n = sc.nextInt();
            hike = new int[n][n];
            dp   = new int[n][n];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    hike[i][j] = sc.nextInt();
                }
            }

            int ans = 0;
            for (int r = 0; r < n; r++) {
                for (int c = 0; c < n; c++) {
                    ans = Math.max(ans, dfs(r, c));
                }
            }

            System.out.println("#" + t + " " + ans);
        }
        sc.close();
    }

    // 메모이제이션 DFS: 규칙(가장 낮은 곳으로만 이동) 반영
    static int dfs(int r, int c) {
        if (dp[r][c] != 0) return dp[r][c];

        int cur = hike[r][c];
        int minLower = Integer.MAX_VALUE;

        // 1) 더 낮은 인접칸들 중 최소 높이값 찾기
        for (int[] d : dirs) {
            int nr = r + d[0], nc = c + d[1];
            if (in(nr, nc) && hike[nr][nc] < cur) {
                minLower = Math.min(minLower, hike[nr][nc]);
            }
        }

        // 2) 더 낮은 인접칸이 없으면 길이 1
        if (minLower == Integer.MAX_VALUE) {
            return dp[r][c] = 1;
        }

        // 3) 최소 높이값을 가진 이웃들만 대상으로 최장 선택
        int best = 0;
        for (int[] d : dirs) {
            int nr = r + d[0], nc = c + d[1];
            if (in(nr, nc) && hike[nr][nc] == minLower) {
                best = Math.max(best, dfs(nr, nc));
            }
        }

        return dp[r][c] = 1 + best;
    }

    static boolean in(int r, int c) {
        return 0 <= r && r < n && 0 <= c && c < n;
    }
}
