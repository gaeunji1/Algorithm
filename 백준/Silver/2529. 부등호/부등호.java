import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    
    // 부등호 기호를 저장할 배열
    static String[] signs; 
    
    // 이미 사용된 숫자인지 체크하는 배열 (0부터 9까지)
    static boolean[] visited = new boolean[10];
    
    // 부등호 관계를 만족하는 모든 정수 문자열을 저장하는 리스트
    static List<String> results = new ArrayList<>();
    
    // 최대값과 최소값을 찾기 위한 재귀 함수 (DFS)
    // index: 현재 채워 넣을 숫자의 위치 (0부터 k까지, 총 k+1개의 숫자)
    // currentNum: 현재까지 만들어진 정수 문자열
    public static void findNumbers(int index, String currentNum) {
        // [종료 조건] k+1개의 숫자를 모두 채운 경우
        if (index == signs.length + 1) {
            results.add(currentNum);
            return;
        }

        // 0부터 9까지의 숫자를 반복하며 다음 숫자를 선택합니다.
        for (int i = 0; i <= 9; i++) {
            // 1. 이미 사용된 숫자인지 확인합니다.
            if (!visited[i]) {
                // [시작 조건] 첫 번째 숫자(index=0)인 경우 부등호 검사가 필요 없습니다.
                if (index == 0) {
                    visited[i] = true; // 현재 숫자 사용 표시
                    findNumbers(index + 1, currentNum + i); // 다음 자리 탐색
                    visited[i] = false; // 백트래킹: 사용 표시 해제
                } 
                // [일반 조건] 두 번째 숫자(index > 0)부터 부등호 검사가 필요합니다.
                else {
                    // 이전 숫자 (currentNum의 마지막 문자)
                    int prevDigit = currentNum.charAt(index - 1) - '0';
                    // 현재 부등호 기호
                    String sign = signs[index - 1];
                    
                    // 부등호 관계가 만족하는지 검사
                    if (check(prevDigit, i, sign)) {
                        visited[i] = true; // 현재 숫자 사용 표시
                        findNumbers(index + 1, currentNum + i); // 다음 자리 탐색
                        visited[i] = false; // 백트래킹: 사용 표시 해제
                    }
                }
            }
        }
    }
    
    // 두 숫자(prev, next)와 부등호(sign)가 관계를 만족하는지 검사하는 함수
    public static boolean check(int prev, int next, String sign) {
        if (sign.equals("<")) {
            return prev < next;
        } else if (sign.equals(">")) {
            return prev > next;
        }
        return false; // 오류 방지
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            // 첫 줄에 부등호 문자의 개수 k를 읽습니다.
            int k = scanner.nextInt();
            
            // k개의 부등호 기호를 읽습니다.
            signs = new String[k];
            for (int i = 0; i < k; i++) {
                signs[i] = scanner.next();
            }

            // 백트래킹 시작: 0번째 위치부터 빈 문자열("")로 시작
            findNumbers(0, "");

            // 결과 리스트 results는 문자열로 저장되어 있어, 
            // 사전식(Lexicographical)으로 정렬하면 최대값과 최소값을 쉽게 찾을 수 있습니다.
            
            // 문자열 정렬 (오름차순): 가장 첫 번째 요소가 최소값, 가장 마지막 요소가 최대값
            results.sort(null); 
            
            // 최대값 (가장 마지막 요소) 출력
            System.out.println(results.get(results.size() - 1));
            
            // 최소값 (가장 첫 번째 요소) 출력
            System.out.println(results.get(0));
            
        } catch (Exception e) {
            // 예외 처리
        } finally {
            scanner.close();
        }
    }
}