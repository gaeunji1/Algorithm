import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 정수 N 입력 받기
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            
            // N번 반복하며 SciComLove 출력
            for (int i = 0; i < n; i++) {
                System.out.println("SciComLove");
            }
        }
        
        sc.close();
    }
}