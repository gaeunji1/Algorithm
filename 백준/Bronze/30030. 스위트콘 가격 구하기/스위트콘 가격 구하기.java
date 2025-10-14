import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int B = sc.nextInt();
        int A = B * 10 / 11;  // B / 1.1 과 동일 (정수로 정확히 떨어짐)
        System.out.println(A);
    }
}
