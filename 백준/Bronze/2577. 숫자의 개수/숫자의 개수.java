import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        int result = a * b* c;
        int[] arr = new int[10];
        
        
        while(result >0) {
        	int digit = result % 10;
        	arr[digit]++;
        	result /= 10;
        }
        
        for(int i = 0; i<10; i++) {
        	System.out.println(arr[i]);
        }
        
        
        
    }
}
