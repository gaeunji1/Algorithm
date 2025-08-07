
import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		
//		int tc = sc.nextInt();
//		sc.nextLine();
//		for(int j = 1; j<= tc; j++) {
			String input = sc.nextLine();
			
			Stack<Character> stack= new Stack<>();
			int result = 0;
			char prev =' ';
			
			for(int i = 0; i<input.length(); i++) {
				char ch = input.charAt(i);
				
				if(ch == '(') {
					stack.push(ch);
				}
				else if(ch == ')') {
					stack.pop();
					// 레이저
					if(prev == '(') {
						result += stack.size();
					} else {
						result += 1;
					}
				}
				prev = ch;
			}
			
			System.out.println(result);
			
		}
		
	}
//}
