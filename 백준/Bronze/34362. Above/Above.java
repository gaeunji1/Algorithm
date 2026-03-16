import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력값이 실물이므로 double로 받습니다.
        if (sc.hasNextDouble()) {
            double altitude = sc.nextDouble();
            
            // 해수면이 0.3m 상승하면 고도는 0.3m 감소합니다.
            double result = altitude - 0.3;
            
            // 결과 출력 (소수점 아래 자릿수는 자유롭게 출력해도 오차 범위 내면 정답 처리됩니다)
            System.out.println(result);
        }
        
        sc.close();
    }
}