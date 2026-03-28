import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int M = Integer.parseInt(br.readLine()); // 한 바퀴 도는 시간
        int K = Integer.parseInt(br.readLine()); // 사용하지 않는 값
        int C = Integer.parseInt(br.readLine()); // 도는 횟수

        System.out.println(M * C);
    }
}