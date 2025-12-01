import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        String B = sc.next();

        // 15분은 1시간 이내므로 시간 조건은 항상 충족.
        // 재승차 환승 할인 조건은 A와 B가 같은지 여부뿐.
        
        if (A.equals(B)) {
            System.out.println(0);
        } else {
            System.out.println(1550);
        }
    }
}
