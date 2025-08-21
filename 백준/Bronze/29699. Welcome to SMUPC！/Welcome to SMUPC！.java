import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	char[] arr = {'W','e','l','c','o','m','e','T','o','S','M','U','P','C'};
    	int n = sc.nextInt();
    	int num = (n-1) % 14;
    	
    	System.out.println(arr[num]);
    	
    	sc.close();
    }
}