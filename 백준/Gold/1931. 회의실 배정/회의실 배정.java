import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // 표준 입력을 처리하는 Scanner
        Scanner scanner = new Scanner(System.in);

        try {
            if (!scanner.hasNextInt()) return;
            int N = scanner.nextInt();

            // [시작 시간, 끝나는 시간]을 저장할 배열
            int[][] meetings = new int[N][2];
            
            // N개의 회의 정보를 읽어 배열에 저장
            for (int i = 0; i < N; i++) {
                if (!scanner.hasNextInt()) break;
                meetings[i][0] = scanner.nextInt(); 
                
                if (!scanner.hasNextInt()) break;
                meetings[i][1] = scanner.nextInt(); 
            }

            // ------------------------------------------------------------------
            // 그리디 알고리즘: 종료 시간 기준으로 정렬 (람다식 사용)
            // 1. 종료 시간이 같으면 시작 시간 기준 오름차순
            // 2. 아니면 종료 시간 기준 오름차순
            // ------------------------------------------------------------------
            Arrays.sort(meetings, (o1, o2) -> {
                if (o1[1] == o2[1]) {
                    return o1[0] - o2[0];
                }
                return o1[1] - o2[1];
            });
            
            int count = 0;         // 최대 회의 개수
            int lastEndTime = 0;   // 마지막 회의 종료 시간

            // 정렬된 배열을 순회하며 겹치지 않는 회의 선택
            for (int i = 0; i < N; i++) {
                // 현재 회의 시작 시간이 마지막 종료 시간보다 크거나 같으면 선택
                if (meetings[i][0] >= lastEndTime) {
                    count++;
                    lastEndTime = meetings[i][1];
                }
            }
            
            // 결과 출력
            System.out.println(count);
            
        } finally {
            scanner.close();
        }
    }
}