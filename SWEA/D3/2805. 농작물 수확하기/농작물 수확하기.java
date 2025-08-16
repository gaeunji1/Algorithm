
import java.util.Scanner;


public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = Integer.parseInt(sc.nextLine());

        for (int t = 1; t <= tc; t++) {
            int N = Integer.parseInt(sc.nextLine());

            int mid = N/2;
            int sum = 0;
            
            for (int i = 0; i < N; i++) {
                String s = sc.nextLine();               // 공백 없는 N글자
                for (int j = 0; j < N; j++) {
                	if (Math.abs(i - mid) + Math.abs(j - mid) <= mid) {
                        sum += s.charAt(j) - '0';
                    }
                }
            }
            System.out.println("#" + t + " " + sum);
        }
        sc.close();
    }
}
