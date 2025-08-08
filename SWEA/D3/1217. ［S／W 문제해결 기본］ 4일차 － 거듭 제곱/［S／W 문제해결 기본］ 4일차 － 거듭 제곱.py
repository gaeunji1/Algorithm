import java.util.Scanner;

public class Solution {
    public static int calc(int a, int b) {
        if(b == 0) {
            return  1;
        }
        return a * calc(a, b - 1);
    }
     
     
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        for (int t = 0; t < 10; t++) {
            int tc = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
             
            System.out.println("#" + (t + 1) + " "+ calc(a, b)); 
        }
    }
}