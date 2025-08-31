import java.util.ArrayDeque;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int t = 1; t <= 10; t++) {
			// 입력
			int n = sc.nextInt();
			ArrayDeque<Character> stack = new ArrayDeque<>();
			boolean isValid = true;
			
			String str = sc.next();
			Character[] ch = new Character[n];
			
			// 로직
			// 스택에 여는 괄호 넣고, 동일한 닫는 괄호가 있으면 pop
			// 괄호 4종류 = ( { [ <
			
			for(int i = 0; i<n; i++) {
				ch[i] = str.charAt(i);
				// 여는 괄호 스택에 넣기
				if(ch[i] == '(' || ch[i] == '{' || ch[i] == '[' || ch[i] == '<') {
					stack.push(ch[i]);
				} else {
					// 닫는 괄호인데 스택이 비어있는 경우
					if(stack.isEmpty()) {
						isValid = false;
						break;
					}
					
					// 괄호 짝이 맞는 경우
					if(stack.peek() == '(' && ch[i] == ')' ||
							stack.peek() == '{' && ch[i] == '}' ||
							stack.peek() == '[' && ch[i] == ']' ||
							stack.peek() == '<' && ch[i] == '>' ) {
						stack.pop();
					} else {
						isValid = false;
					}
				}
			}
			// 출력
			if(isValid && stack.isEmpty()) {
				System.out.println("#" + t + " 1");
			} else {
				System.out.println("#" + t + " 0");
			}
		}
	}
}