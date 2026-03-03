import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력: 나이 A, 티어 T
        int A = sc.nextInt();
        int T = sc.nextInt();

        // 덕후력 P 계산
        // P = 10 + 2 * (25 - A + T)
        int P = 10 + 2 * (25 - A + T);

        // 결과가 0보다 작으면 0을 출력
        if (P < 0) {
            System.out.println(0);
        } else {
            System.out.println(P);
        }

        sc.close();
    }
}