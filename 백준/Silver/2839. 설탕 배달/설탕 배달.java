import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int answer = -1;
        int five = n / 5;

        for (int f = five; f >= 0; f--) {
            int remain = n - 5 * f;
            if (remain % 3 == 0) {
                int three = remain / 3;
                answer = f + three;
                break; // 최소 개수 보장
            }
        }

        System.out.println(answer);
    }
}
