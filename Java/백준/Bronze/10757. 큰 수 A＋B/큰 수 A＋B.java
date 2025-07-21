import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		// 표준 입력 스트림 System.in (byte)
//		byte byte1 = (byte) System.in.read(); // 거의 활용하지 않음...!
		// Scanner의 역할 : 표준 입력으로 받은 byte의 형식 데이터를 char형으로 전환...!
		Scanner scanner = new Scanner(System.in);
		
//		// 문자열 데이터 한번에 가져오기 (문자열 가져오는 메서드)
//		System.out.println(scanner.next());		// 공백 문자(space, tab, newline)에 해당되는 데이터 전까지 문자열을 가져온다.
//		System.out.println(scanner.nextLine()); // 개행문자(newline) 에 해당되는 데이터 전까지 문자열을 가져온다.
//		
//		// 정수 하나를 입력 받아보기 ...!
//		int a = scanner.nextInt();
//		System.out.println(a);
//		
//		float b = scanner.nextFloat();
//		double d = scanner.nextDouble();
//		boolean c =scanner.nextBoolean();
		
		// 정수형 입력 두개를 받아서 a, b 변수에 할당한다...!
		BigInteger a = scanner.nextBigInteger();
		BigInteger b = scanner.nextBigInteger();
		
		// a - b를 합하여 출력해보세요..!
		System.out.println(a.add(b));
	}
}