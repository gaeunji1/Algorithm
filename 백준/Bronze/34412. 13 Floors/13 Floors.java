import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 실제 층수 x 입력
        if (sc.hasNextInt()) {
            int x = sc.nextInt();
            
            // 13층을 건너뛰는 로직 적용
            if (x < 13) {
                System.out.println(x);
            } else {
                System.out.println(x + 1);
            }
        }
        
        sc.close();
    }
}