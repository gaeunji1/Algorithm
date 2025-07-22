import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int hour = scanner.nextInt();
		int min = scanner.nextInt();
		int ovenTime = scanner.nextInt();
		
		int allTime = hour * 60 + min + ovenTime;
		
		int allHour = allTime / 60;
		int allMin = allTime % 60;
		
		if(allHour>= 24) {
			allHour -= 24;
		}
		
		System.out.println(allHour);
		System.out.println(allMin);
	}
}