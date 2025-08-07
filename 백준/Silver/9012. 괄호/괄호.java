import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // 개행 제거

        for (int i = 0; i < t; i++) {
            String input = sc.nextLine();
            Stack<Character> stack = new Stack<>();
            boolean isValid = true;

            for (int j = 0; j < input.length(); j++) {
                char ch = input.charAt(j);

                if (ch == '(') {
                    stack.push(ch);
                } else if (ch == ')') {
                    if (stack.isEmpty()) {
                        isValid = false;
                        break;
                    } else {
                        stack.pop();
                    }
                }
            }

            if (isValid && stack.isEmpty()) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
