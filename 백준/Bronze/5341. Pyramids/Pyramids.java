import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            int num = sc.nextInt();
            if (num == 0) break;
            //(1)
            System.out.println(pyramids(num));
            //(2)
        }
    }

    private static int pyramids(int num) {
        int result = 0;
        for (int i = 1; i <= num; i++) {
            result += i;
            //(3)

        }
        return result;
        //(4)
    }
}