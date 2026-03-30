import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 백준 33571번 문제
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();

        int totalHoles = 0; // 총 구멍의 개수를 저장할 변수
        for(char ch : S.toCharArray()) { // 문자열의 각 문자를 순회하며 구멍 개수를 계산합니다.
            if(ch == 'B') {
                totalHoles += 2; // 'B'는 구멍이 2개
            } else if (ch == 'A' || ch == 'D' || ch == 'O' || ch == 'P' || ch == 'Q' || ch == 'R' ||
                    ch == 'a' || ch == 'b' || ch == 'd' || ch == 'e' || ch == 'g' || ch == 'o' ||
                    ch == 'p' || ch == 'q' || ch == '@') {
                totalHoles += 1; // 구멍이 1개인 모든 대소문자 및 '@'
                // 나머지 문자는 구멍이 0개이므로 아무것도 더하지 않습니다.
            }
        }

        System.out.println(totalHoles); // 최종 구멍 개수 출력
        br.close(); // BufferedReader를 닫아 자원을 해제합니다.
    }
}