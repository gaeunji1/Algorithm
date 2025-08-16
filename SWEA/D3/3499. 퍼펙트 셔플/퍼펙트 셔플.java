import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();                 // nextInt로 통일

        StringBuilder sb = new StringBuilder();

        for (int t = 1; t <= T; t++) {
            int N = sc.nextInt();             // nextInt로 통일
            String[] arr = new String[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.next();           // 카드 문자열들
            }

            int mid = (N + 1) / 2;            // 왼쪽이 1장 더 많을 수 있음
            String[] left = new String[mid];
            String[] right = new String[N - mid];

            for (int i = 0; i < mid; i++) left[i] = arr[i];
            for (int i = 0; i < N - mid; i++) right[i] = arr[mid + i];

            sb.append('#').append(t).append(' ');   // 줄바꿈 없이 헤더

            // 교차 출력
            for (int i = 0; i < right.length; i++) {
                sb.append(left[i]).append(' ').append(right[i]).append(' ');
            }
            // 홀수일 때 남은 한 장
            if (left.length > right.length) {
                sb.append(left[left.length - 1]);
            }
            sb.append('\n');
        }

        System.out.print(sb.toString());
        sc.close();
    }
}
