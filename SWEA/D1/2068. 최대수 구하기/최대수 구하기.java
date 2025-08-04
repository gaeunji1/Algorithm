import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         
        int T = sc.nextInt();
         
        for(int j = 1; j<=T ; j++) {
            // 배열 생성
            int[] arr = new int[10];
             
            for(int i = 0; i < 10 ; i++) {
                arr[i] = sc.nextInt();
            }
             
            // 최대 최소
            int max= 0;
             
            for(int i = 0; i< 10; i++) {
                if(arr[i]>max) {
                    max = arr[i];
                }
            }
             
            // 츨력값
            System.out.println("#" + j + " " + max);
        }
    }
}