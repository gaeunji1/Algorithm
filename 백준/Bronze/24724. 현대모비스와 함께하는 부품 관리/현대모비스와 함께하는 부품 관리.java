import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine().trim()); // 부품 관리 횟수

        for (int t = 1; t <= T; t++) {
            int N = Integer.parseInt(br.readLine().trim()); // 부품 개수

            // A, B 읽기
            StringTokenizer st = new StringTokenizer(br.readLine());
            long A = Long.parseLong(st.nextToken());
            long B = Long.parseLong(st.nextToken());
            // 실제로는 A, B를 사용하지 않음

            // N개의 부품 정보 (u_i, v_i) 읽고 버리기
            for (int i = 0; i < N; i++) {
                br.readLine(); // "u_i v_i" 한 줄 통째로 버리기
            }

            // 출력 형식 그대로 맞추기
            sb.append("Material Management ").append(t).append('\n');
            sb.append("Classification ---- End!").append('\n');
        }

        System.out.print(sb.toString());
    }
}
