import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력: 민건이 집까지 거리 L
        int L = sc.nextInt();

        // 최소 시간 = L을 5로 나눈 올림값
        int result = (int) Math.ceil(L / 5.0);

        // 출력
        System.out.println(result);

        sc.close();
    }
}
