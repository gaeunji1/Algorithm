import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int[][] array = new int[n][m];
        int[][] array2 = new int[m][n];
        
        for(int i = 0; i < n ; i++)
            for(int j = 0; j < m ; j++)
                array[i][j] = sc.nextInt();
        
        for(int i = 0; i < n ; i++)
            for(int j = 0 ; j < m ; j++)
                array2[j][n-1-i] = array[i][j];

        // 원하는 형태로 출력
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(array2[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
