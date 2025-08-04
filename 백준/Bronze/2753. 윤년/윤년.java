import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner 선언
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.close();


        /**
         * 윤년의 조건
         * 4의 배수 & 100의 배수가 아닐 때
         * 400의 배수일 때
         *
         * => 윤년 : 1
         * => 윤년 : 0
         */

        if (n % 4 == 0 && n % 100 != 0){
            System.out.println(1);
        }
        else if(n % 400 == 0){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }

    }

}