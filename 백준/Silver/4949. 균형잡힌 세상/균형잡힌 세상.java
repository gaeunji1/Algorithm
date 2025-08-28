import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String line = sc.nextLine();
            if (line.equals(".")) break; // 입력 종료 조건

            Stack<Character> st = new Stack<>();
            boolean ok = true;

            for (char c : line.toCharArray()) {
                if (c == '(' || c == '[') {
                    st.push(c);
                } else if (c == ')') {
                    if (st.isEmpty() || st.peek() != '(') {
                        ok = false; break;
                    }
                    st.pop();
                } else if (c == ']') {
                    if (st.isEmpty() || st.peek() != '[') {
                        ok = false; break;
                    }
                    st.pop();
                }
                // 나머지 문자는 무시
            }

            if (!st.isEmpty()) ok = false;
            System.out.println(ok ? "yes" : "no");
        }

        sc.close();
    }
}
