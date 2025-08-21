import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int num = sc.nextInt();
    	int dal = 0, pho = 0;
    	for(int i = 0; i<num; i++) {
    		String win = sc.next();
    		if(dal-pho == 2 || pho - dal==2) {
    			break;
    		}
    		
    		if(win.equals("D")) dal++;
    		if(win.equals("P")) pho++;
    	}
    	System.out.println(dal + ":" + pho);
    }
}