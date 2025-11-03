import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;

        while ((line = br.readLine()) != null && !line.isEmpty()) {
            StringTokenizer st = new StringTokenizer(line);
            double n = Double.parseDouble(st.nextToken()); // 초기 금액
            double b = Double.parseDouble(st.nextToken()); // 이자율
            double m = Double.parseDouble(st.nextToken()); // 목표 금액

            int year = 0;
            while (n <= m) {
                n += n * b / 100.0;
                year++;
            }

            System.out.println(year);
        }
    }
}
