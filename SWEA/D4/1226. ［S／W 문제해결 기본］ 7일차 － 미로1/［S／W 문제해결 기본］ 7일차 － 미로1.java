import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    static int[][] maze = new int[16][16];
    static boolean[][] visited = new boolean[16][16];
    static int startR, startC;
    static boolean found;
    static final int[][] dirs = { {-1,0}, {1,0}, {0,-1}, {0,1} };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int t = 1; t <= 10; t++) {
            // 1) 케이스 번호 버리기
            sc.nextInt();

            // 2) 입력 (각 행은 공백 없는 16글자이므로 next() 사용)
            startR = startC = -1;
            for (int i = 0; i < 16; i++) {
                String row = sc.next();
                for (int j = 0; j < 16; j++) {
                    int cell = row.charAt(j) - '0';
                    maze[i][j] = cell;
                    if (cell == 2) {
                        startR = i;
                        startC = j;
                    }
                }
            }

            // 3) 초기화
            for (int i = 0; i < 16; i++) Arrays.fill(visited[i], false);
            found = false;

            // 4) DFS 실행
            if (startR != -1) dfs(startR, startC);

            // 5) 출력
            System.out.println("#" + t + " " + (found ? 1 : 0));
        }
    }

    static void dfs(int r, int c) {
        if (found) return;
        if (r < 0 || r >= 16 || c < 0 || c >= 16) return;
        if (maze[r][c] == 1 || visited[r][c]) return;

        if (maze[r][c] == 3) { // 도착
            found = true;
            return;
        }

        visited[r][c] = true;

        for (int[] d : dirs) {
            dfs(r + d[0], c + d[1]);
            if (found) return;
        }
    }
}
