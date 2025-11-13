import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1) 소수 테이블 생성
        boolean[] isPrime = new boolean[1000001];
        for (int i = 2; i <= 1000000; i++) isPrime[i] = true;

        // 소수 제크!
        for (int i = 2; i * i <= 1000000; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= 1000000; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // 2) 입력 처리
        while (true) {
            int num = sc.nextInt();
            if (num == 0) break;

            boolean found = false;

            for (int a = 3; a <= num / 2; a += 2) {  // 홀수만
                if (isPrime[a] && isPrime[num - a]) {
                    System.out.println(num + " = " + a + " + " + (num - a));
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Goldbach's conjecture is wrong.");
            }
        }
    }
}
