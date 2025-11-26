import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // 표준 입력을 처리하는 Scanner
        Scanner scanner = new Scanner(System.in);

        try {
            if (!scanner.hasNextInt()) return;
            // 로프의 개수 N을 읽습니다.
            int N = scanner.nextInt();

            // 로프들의 최대 중량 정보를 저장할 ArrayList
            // Collections.sort를 사용하기 위해 기본 타입 배열 대신 ArrayList<Integer>를 사용합니다.
            ArrayList<Integer> ropes = new ArrayList<>();
            
            // N개의 로프 정보를 읽어 리스트에 저장
            for (int i = 0; i < N; i++) {
                if (!scanner.hasNextInt()) break;
                ropes.add(scanner.nextInt()); 
            }

            // ------------------------------------------------------------------
            // [그리디(Greedy) 알고리즘 적용]
            // 전략: 로프들을 내림차순으로 정렬합니다. 
            // ------------------------------------------------------------------
            
            // 1. 로프의 최대 중량들을 내림차순으로 정렬합니다.
            // Collections.reverseOrder()를 사용하여 내림차순 정렬
            Collections.sort(ropes, Collections.reverseOrder());
            
            long maxWeight = 0; // 최대 중량은 N * 10000 = 1,000,000,000 (10억)까지 가능하므로 long 사용
            
            // 2. 정렬된 로프 리스트를 순회하며 최대 중량을 계산합니다.
            for (int i = 0; i < N; i++) {
                // 현재 로프의 최대 중량 (내림차순 정렬에서 i번째)
                long currentRopeWeight = ropes.get(i);
                
                // 현재까지 사용한 로프의 개수 (i=0일 때 1개, i=1일 때 2개...)
                long k = i + 1;
                
                // i번째 로프(가장 약한 로프)를 포함하여 k개의 로프를 사용했을 때 들어올릴 수 있는 중량
                // = k * (k개의 로프 중 가장 약한 로프의 최대 중량)
                long currentMax = currentRopeWeight * k;
                
                // 전체 최댓값을 업데이트합니다.
                if (currentMax > maxWeight) {
                    maxWeight = currentMax;
                }
            }
            
            // 최대 중량을 출력합니다.
            System.out.println(maxWeight);
            
        } finally {
            // Scanner 자원을 닫습니다.
            scanner.close();
        }
    }
}