import java.util.Scanner;

public class Main {
	public static int sangsu(String a) {
        char[] arr = a.toCharArray();
        char[] newArr = {arr[2], arr[1], arr[0]}; // 문자열 뒤집기

        String reversed = new String(newArr); // char[] → String
        int num = Integer.parseInt(reversed); // String → int

        return num;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		String b = sc.next();
		
		int newA = sangsu(a);
		int newB = sangsu(b);
		
		if(newA > newB) System.out.println(newA);
		else System.out.println(newB);
		
	}
}