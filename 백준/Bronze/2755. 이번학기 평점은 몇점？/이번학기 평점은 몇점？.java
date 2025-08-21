import java.util.Scanner;

public class Main {
    public static double gradeToNum(String grade) {
        switch (grade) {
            case "A+": return 4.3;
            case "A0":  return 4.0;
            case "A-": return 3.7;
            case "B+": return 3.3;
            case "B0":  return 3.0;
            case "B-": return 2.7;
            case "C+": return 2.3;
            case "C0":  return 2.0;
            case "C-": return 1.7;
            case "D+": return 1.3;
            case "D0":  return 1.0;
            case "D-": return 0.7;
            default:   return 0.0; // F 등
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        double totalPoints = 0.0; // 학점*평점 합
        int totalCredits = 0;     // 총 학점 수

        for (int i = 0; i < n; i++) {
            String name = sc.next();   // 과목명
            int credit = sc.nextInt(); // 학점 수
            String grade = sc.next();  // 등급

            double score = gradeToNum(grade);
            totalPoints += credit * score;
            totalCredits += credit;
        }
        double result = totalPoints / totalCredits;

//         GPA(평균 평점) 출력하려면 아래 줄로 교체
         System.out.println(String.format("%.2f", result));
    }
}
