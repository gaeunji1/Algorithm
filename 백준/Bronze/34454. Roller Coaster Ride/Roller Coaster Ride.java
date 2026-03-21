import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 내 순서
        int C = sc.nextInt(); // 차량 수
        int P = sc.nextInt(); // 차량당 인원

        int capacity = C * P;

        if (N <= capacity) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}