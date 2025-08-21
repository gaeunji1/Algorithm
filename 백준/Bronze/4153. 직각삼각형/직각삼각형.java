import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if (a == 0 && b == 0 && c == 0) break;

            int[] arr = {a, b, c};
            Arrays.sort(arr); // arr[2]가 가장 긴 변(빗변 후보)

            int x = arr[0], y = arr[1], z = arr[2];
            if (x*x + y*y == z*z) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
        }
    }
}
