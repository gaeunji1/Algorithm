import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int people =sc.nextInt();
        int[] size = new int[6];
        for(int i = 0; i<6; i++) {
        	size[i] = sc.nextInt();
        }
        int t = sc.nextInt();
        int p = sc.nextInt();
        int count = 0;
        
        for(int i = 0; i<6; i++) {
        	if(size[i] % t == 0) {
        		count += size[i] / t;
        	} else {
        		count += (size[i] /t) +1;
        	}
        }
        System.out.println(count);
        int result = people / p;
        int result2 = people % p;
        System.out.println(result + " " + result2);
    }
}