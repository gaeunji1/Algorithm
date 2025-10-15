import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long nL = Long.parseLong(br.readLine().trim());
        int N = (int)nL; // 문제 범위면 int로 충분

        StringBuilder sb = new StringBuilder(N * 3);

        int mod = N % 6;
        if (mod != 2 && mod != 3) {
            // 짝수 -> 홀수
            for (int c = 2; c <= N; c += 2) sb.append(c).append('\n');
            for (int c = 1; c <= N; c += 2) sb.append(c).append('\n');
        } else if (mod == 2) {
            // 짝수 전부
            for (int c = 2; c <= N; c += 2) sb.append(c).append('\n');
            // 홀수: 3,1,7,9,11,...,N-1, 5
            if (N >= 1) sb.append(3).append('\n');
            if (N >= 1) sb.append(1).append('\n');
            for (int c = 7; c <= N; c += 2) sb.append(c).append('\n');
            if (N >= 5) sb.append(5).append('\n');
        } else { // mod == 3
            // 최종 순서: [4,6,8,...,N], [2,5,7,9,...,N-1], [1], [3]
            for (int c = 4; c <= N; c += 2) sb.append(c).append('\n');     // evens without 2
            sb.append(2).append('\n');                                     // 2 바로 이어서
            for (int c = 5; c <= N; c += 2) sb.append(c).append('\n');     // odds without 1,3
            sb.append(1).append('\n');
            if (N >= 3) sb.append(3).append('\n');
        }

        System.out.print(sb.toString());
    }
}
