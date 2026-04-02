import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. 입력 받기 (최대 10^9이므로 String으로 처리하면 '7' 포함 여부 확인이 쉽습니다)
        String input = sc.next();
        long number = Long.parseLong(input);

        // 2. 조건 판별
        boolean containsSeven = input.contains("7");
        boolean isDivisibleBySeven = (number % 7 == 0);

        // 3. 결과 계산 및 출력
        if (!containsSeven && !isDivisibleBySeven) {
            System.out.println(0);
        } else if (!containsSeven && isDivisibleBySeven) {
            System.out.println(1);
        } else if (containsSeven && !isDivisibleBySeven) {
            System.out.println(2);
        } else if (containsSeven && isDivisibleBySeven) {
            System.out.println(3);
        }
        
        sc.close();
    }
}