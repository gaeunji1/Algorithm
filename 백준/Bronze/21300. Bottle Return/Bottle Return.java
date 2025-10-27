import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = 0;
        // 6개의 정수 입력받기
        for (int i = 0; i < 6; i++) {
            total += sc.nextInt();
        }

        // 뉴욕주 환불: 개당 5센트
        int refund = total * 5;

        // 센트 단위로 출력
        System.out.println(refund);

        sc.close();
    }
}
