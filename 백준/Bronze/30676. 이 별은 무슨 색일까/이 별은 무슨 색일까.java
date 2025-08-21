import java.util.Scanner;

public class Main {
	public static String change(int num) {
		String result = null;
		if(num >=620 && num <= 780) {
			result = "Red";
		}
		else if(num >= 590 && num <= 620) {
			result = "Orange";
		}
		else if(num >= 570 && num <= 590) {
			result = "Yellow";
		}
		else if(num >= 495 && num <= 570) {
			result = "Green";
		}
		else if(num >= 450 && num <= 495) {
			result = "Blue";
		}
		else if(num >= 425 && num <= 450) {
			result = "Indigo";
		}
		else if(num >= 380 && num <= 425) {
			result = "Violet";
		}
		return result;
	}
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int num = sc.nextInt();
    	
    	System.out.println(change(num));
    }
}