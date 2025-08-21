import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	String[][] arr = new String[15][15];
    	
    	for(int i = 0; i<15;i++) {
    		for(int j = 0; j<15; j++) {
    			arr[i][j] = sc.next();
    		}
    	}
    	String result=null;
    	for(int i = 0; i<15;i++) {
    		for(int j = 0; j<15; j++) {
    			if(arr[i][j].equals("w")) {
    				result = "chunbae";
    				break;
    			}
    			else if(arr[i][j].equals("b")) {
    				result = "nabi";
    				break;
    			}
    			else if(arr[i][j].equals("g")) {
    				result = "yeongcheol";
    				break;
    			}
    		}
    	}
    	System.out.println(result);
    }
}