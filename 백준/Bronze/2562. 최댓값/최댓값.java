import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 배열 생성
        int[] arr = new int[10];
         
        for(int i = 0; i < 9 ; i++) {
            arr[i] = sc.nextInt();
        }
        // 최대값
         int max = 0;
         for(int i = 0; i< 10; i++) {
             if(arr[i]>max) {
                 max = arr[i];
             }
         }
         System.out.println(max);
         for(int i = 0; i< 10; i++) {
             if(arr[i]==max) {
                 System.out.println(i+1);
                 break;
             }
         }
	}
}