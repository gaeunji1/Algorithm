import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 첫 번째 줄: 시작점에서 의사당까지의 거리 (m)
        int m = sc.nextInt();
        
        // 두 번째 줄: 참여 학생 수 (n) - 계산에는 사용되지 않음
        int n = sc.nextInt();
        
        // 세 번째 줄: 도착 시 온도 (t) - 계산에는 사용되지 않음
        int t = sc.nextInt();

        // 왕복 거리이므로 m * 2 출력
        System.out.println(m * 2);

        sc.close();
    }
}