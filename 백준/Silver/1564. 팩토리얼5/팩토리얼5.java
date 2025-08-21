import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        long res = 1;
        int cnt2 = 0, cnt5 = 0;

        for (int i = 1; i <= n; i++) {
            int x = i;
            // 2의 인자 수 세기
            while (x % 2 == 0) {
                cnt2++;
                x /= 2;
            }
            // 5의 인자 수 세기
            while (x % 5 == 0) {
                cnt5++;
                x /= 5;
            }
            res *= x;
            res %= 1000000000000L; // 충분히 크게 잘라서 관리
        }

        // 남은 2,5의 차이만큼 곱하기
        int diff = cnt2 - cnt5;
        for (int i = 0; i < diff; i++) {
            res *= 2;
            res %= 1000000000000L;
        }

        // 뒤쪽 0 제거
        while (res % 10 == 0) {
            res /= 10;
        }

        // 마지막 5자리
        res %= 100000;

        // 0으로 시작할 수 있으니 5자리 포맷 맞춰 출력
        System.out.printf("%05d\n", res);
    }
}
