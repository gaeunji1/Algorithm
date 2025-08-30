import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();

        // 위쪽 (가운데 포함)
        for (int i = 1; i <= N; i++) {
            for (int s = 0; s < N - i; s++) sb.append(' ');
            for (int k = 0; k < 2 * i - 1; k++) sb.append('*');
            sb.append('\n');
        }
        // 아래쪽
        for (int i = N - 1; i >= 1; i--) {
            for (int s = 0; s < N - i; s++) sb.append(' ');
            for (int k = 0; k < 2 * i - 1; k++) sb.append('*');
            sb.append('\n');
        }

        System.out.print(sb.toString());
    }
}
