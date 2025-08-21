import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	int n = sc.nextInt();
    	int[] arr = new int[n];
    	int sum = 0;
    	// 제일 작은 홀수
    	int s = 1000;
    	
    	for(int i = 0;i<n;i++) {
    		arr[i] = sc.nextInt();
    		sum += arr[i];
    		if(arr[i] % 2 == 1 && arr[i] < s) {
    			s = arr[i];
    		}
    	}
    	if(s == 1000) s = 0;
    	if(sum%2 == 0) {
    		System.out.println(sum);
    	} else {
    		System.out.println(sum-s);
    	}
    	
    	
    }
}