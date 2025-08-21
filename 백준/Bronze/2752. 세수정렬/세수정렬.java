import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int max = Math.max(a, b);
		max = Math.max(max, c);
		int min = Math.min(a, b);
		min = Math.min(min, c);
		int center = 0;
		if ((a == max && c == min) || (c == max && a == min)) {
			center = b;
		} else if ((b == max && c == min) || (c == max && b == min)) {
			center = a;
		} else if ((a == max && b == min) || (b == max && a == min)) {
			center = c;
		}

		System.out.println(min + " " + center + " " + max);
	}

}