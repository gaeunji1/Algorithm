import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = 1, y = 1;

		while (true) {
			x = sc.nextInt();
			y = sc.nextInt();
			if (x == 0 && y == 0) {
				break;
			}
			else{
				System.out.println(x + y);
			}
		}

	}

}
