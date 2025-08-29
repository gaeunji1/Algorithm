import java.util.*;

public class Main {
    static int k;
    static int[] s;
    static int[] pick = new int[6];
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean firstCase = true;

        while (true) {
            k = sc.nextInt();
            if (k == 0) break;

            s = new int[k];
            for (int i = 0; i < k; i++) s[i] = sc.nextInt();

            if (!firstCase) sb.append('\n'); // 케이스 사이 빈 줄
            firstCase = false;

            dfs(0, 0);
        }

        System.out.print(sb.toString());
        sc.close();
    }

    static void dfs(int depth, int start) {
        if (depth == 6) {
            for (int i = 0; i < 6; i++) {
                if (i > 0) sb.append(' ');
                sb.append(pick[i]);
            }
            sb.append('\n');
            return;
        }
        for (int i = start; i <= k - (6 - depth); i++) {
            pick[depth] = s[i];
            dfs(depth + 1, i + 1);
        }
    }
}