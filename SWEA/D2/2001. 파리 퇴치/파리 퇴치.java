import java.util.Scanner;
 
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
         
        for(int t =1; t<=tc;t++) {
            int N = sc.nextInt(), M = sc.nextInt();
            int[][] arr = new int[N][N];
            for(int i=0; i<N;i++) {
                for(int j = 0; j<N; j++) {
                    arr[i][j]=sc.nextInt();
                }
            }
            int fly = 0;
            int maxFly=0;
            for(int x=0;x<N-M+1;x++) {
                for(int y = 0; y<N-M+1;y++) {
                    fly=0;
                    for(int a=0;a<M;a++) {
                        for(int b=0;b<M;b++) {
                            int nx=x+a;
                            int ny = y +b;
                            fly+= arr[nx][ny];
                        }
                    }
                     
                    if(fly>maxFly) {
                        maxFly=fly;
                    }
                }
            }
            System.out.println("#" + t + " " +maxFly);
             
        }
         
    }
}