import java.io.*;

public class Main {
    static int digitSum(int x) {
        int s = 0;
        while (x > 0) { s += x % 10; x /= 10; }
        return s;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());

        int digits = String.valueOf(N).length();
        int start = Math.max(1, N - 9 * digits);

        int ans = 0;
        for (int m = start; m < N; m++) {
            if (m + digitSum(m) == N) { ans = m; break; }
        }
        System.out.println(ans);
    }
}
