import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double x = Double.parseDouble(br.readLine().trim());

        long result = (long) Math.floor(x);  // 양수라서 floor와 캐스팅 결과가 동일

        System.out.println(result);  // 정수만 출력
    }
}
