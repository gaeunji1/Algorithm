import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long M = Long.parseLong(st.nextToken()); // 메달 개수
        long K = Long.parseLong(st.nextToken()); // 아이 수

        if (M % K == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
