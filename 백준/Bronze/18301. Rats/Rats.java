import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	int a = sc.nextInt(), b = sc.nextInt(), c= sc.nextInt();
    	
    	int result = (a + 1)*(b + 1)/(c + 1) - 1;
    	
    	System.out.println(result);
    }
}