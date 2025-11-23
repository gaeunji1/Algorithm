import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String word = br.readLine().trim(); // 입력 단어 (대문자)
        String ban = "CAMBRIDGE";

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            // CAMBRIDGE에 포함되지 않은 글자만 추가
            if (ban.indexOf(ch) == -1) {
                sb.append(ch);
            }
        }

        System.out.println(sb.toString());
    }
}
