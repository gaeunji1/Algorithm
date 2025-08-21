import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
        
        int reminder = a % b;
        int result = 0;
        
        for(int i = 0; i<n;i++) {
        	reminder *= 10;
        	result = reminder / b;
        	reminder %= b;
        }
        
        System.out.println(result);
    }
}