import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine().trim());

        if (n % 2 == 1) {
            System.out.print(0);      // 홀수면 짝/홀 둘 다 가능
        } else if (n % 4 == 0) {
            System.out.print(2);      // 4의 배수면 항상 짝수
        } else {
            System.out.print(1);      // 그 외 짝수(= 4로 나눈 나머지 2)면 항상 홀수
        }
    }
}
