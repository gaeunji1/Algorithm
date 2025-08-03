import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Scanner 선언
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();  // 테스트 케이스 개수 입력

        for (int i = 0; i < T; i++) {  // 올바른 반복 횟수 설정
            int A = sc.nextInt();
            int B = sc.nextInt();

            System.out.println(A + B);
        }

        sc.close();  // Scanner 닫기
    }
}
