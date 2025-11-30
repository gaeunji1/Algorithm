import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s1 = sc.nextInt(); // solves by halftime
        int s2 = sc.nextInt(); // solves by end

        // Easy if at least half of final solvers had solved by halftime:
        // s1 >= s2/2  (careful with odd s2)  => 2*s1 >= s2
        System.out.println(2 * s1 >= s2 ? "E" : "H");
        sc.close();
    }
}
