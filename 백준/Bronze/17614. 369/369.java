import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int count=0;
 
        for (int i = 1; i <= length; i++) {
 
            int current = i;
            // 3,6,9 판별
            while (current > 0) {
                int d = current % 10;
 
                if (d != 0 && d % 3 == 0) {
                    count++;
                }
                current = current / 10;
            }
        }
        System.out.println(count);
    }
}