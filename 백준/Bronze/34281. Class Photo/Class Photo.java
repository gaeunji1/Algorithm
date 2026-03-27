import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 가로(w) 입력 받기
        int w = sc.nextInt();
        // 세로(l) 입력 받기
        int l = sc.nextInt();

        // 전체 학생 수는 가로 * 세로
        int totalStudents = w * l;

        // 결과 출력
        System.out.println(totalStudents);

        sc.close();
    }
}