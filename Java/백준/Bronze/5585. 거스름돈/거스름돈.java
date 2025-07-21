import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		
		int money = 1000 - scanner.nextInt();
		
		int mon500 = money / 500;
		money = money - mon500*500;
		
		int mon100 = money / 100;
		money = money - mon100*100;
		
		int mon50 = money / 50;
		money = money - mon50*50;
		
		int mon10 = money / 10;
		money = money - mon10*10;
		
		int mon5 = money / 5;
		money = money - mon5*5;
		
		int mon1 = money;
		
		int result = mon500 + mon100 + mon50 + mon10 + mon5 + mon1;
		
		System.out.println(result);
	}
}
