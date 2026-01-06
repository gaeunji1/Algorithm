import java.io.*;
import java.util.*;

public class Main {

    static long calculator(long a, String op, long b) {
        switch (op) {
            case "+": return a + b;
            case "-": return a - b;
            case "*": return a * b;
            case "/": return a / b; // Java는 정수 나눗셈이 0을 향해 버림(truncate toward zero)
            default: throw new IllegalArgumentException("Unknown operator: " + op);
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long K1 = Long.parseLong(st.nextToken());
        String O1 = st.nextToken();
        long K2 = Long.parseLong(st.nextToken());
        String O2 = st.nextToken();
        long K3 = Long.parseLong(st.nextToken());

        long result1 = calculator(calculator(K1, O1, K2), O2, K3);
        long result2 = calculator(K1, O1, calculator(K2, O2, K3));

        long min = Math.min(result1, result2);
        long max = Math.max(result1, result2);

        System.out.println(min);
        System.out.println(max);
    }
}
