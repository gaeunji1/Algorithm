import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next().toUpperCase();
        sc.close();
        int[] count = new int[26];
        
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i) - 'A']++;
        }
        
        int max = 0;
        char answer ='?';
        
        for(int i = 0; i<26; i++) {
        	if(count[i]> max) {
        		max = count[i];
        		answer=(char) (i+'A');
        		
        	}else if(count[i] == max) {
        		answer='?';
        	}
        }
        System.out.println(answer);
    }
}
