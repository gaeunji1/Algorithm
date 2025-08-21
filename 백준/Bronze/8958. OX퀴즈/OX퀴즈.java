import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i<n; i++) {
        	String str = sc.next();
        	char[] arr = str.toCharArray();
        	
        	int result = 0;
        	int score = 1;
        	
        	for(int j = 0; j<str.length();j++) {
        		if(arr[j] == 'O') {
        			result += score;
        			score++;
        		} else {
        			score = 1;
        		}
        	}
        	System.out.println(result);
        }
        
        
    }
}
