import java.util.Scanner;
import java.io.InputStream;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {
        // 표준 입력을 처리하기 위해 Scanner를 사용합니다.
        // 이는 입력 파일의 공백으로 구분된 정수들을 순서대로 읽을 수 있게 해줍니다.
        Scanner scanner = new Scanner(System.in);
        
        try {
            // 입력에 정수가 남아있는 동안 계속 반복합니다.
            while (scanner.hasNextInt()) {
                // 첫 번째 숫자 N (사람 수)를 읽습니다.
                int N = scanner.nextInt();
                
                // 두 번째 숫자 S (총 주식 수)를 읽습니다.
                // S는 최대 10^9이므로 int로 충분합니다.
                if (scanner.hasNextInt()) {
                    long S = scanner.nextInt(); // N, S의 순서를 맞추기 위해 N 다음에 S를 읽습니다.
                    
                    // 총 주식 공유자 수: N명의 사람 + 1명의 ACM Chief Judge
                    // N은 최대 10000이므로, N+1은 int 범위 내에 있습니다.
                    long totalSharers = N + 1;
                    
                    // 최대 정수 주식 수 x를 계산합니다.
                    // Java에서 정수 나눗셈 (/)은 자동으로 몫(floor)을 계산합니다.
                    long x_max = S / totalSharers;
                    
                    // 결과를 표준 출력에 출력합니다.
                    System.out.println(x_max);
                } else {
                    // N을 읽었으나 S를 읽기 전에 파일이 끝난 경우 (입력 데이터가 홀수인 경우)
                    // 문제에서 '입력 데이터는 정확하다'고 했으므로 발생 가능성은 낮지만, 루프를 종료합니다.
                    break; 
                }
            }
        } catch (Exception e) {
            // 입력 처리 중 발생할 수 있는 오류를 처리합니다.
            // System.err.println("입력 처리 중 오류 발생: " + e.getMessage());
        } finally {
            // Scanner 자원을 닫습니다.
            scanner.close();
        }
    }
}