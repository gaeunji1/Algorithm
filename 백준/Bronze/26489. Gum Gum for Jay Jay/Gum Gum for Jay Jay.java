import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;

        // EOF(더 이상 읽을 줄이 없을 때)까지 한 줄씩 읽어 카운트
        String line;
        while ((line = br.readLine()) != null) {
            count++;
        }

        System.out.print(count);
    }
}
