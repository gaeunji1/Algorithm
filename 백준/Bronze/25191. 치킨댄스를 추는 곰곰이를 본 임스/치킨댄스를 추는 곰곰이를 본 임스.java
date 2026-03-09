import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        final String input01 = br.readLine();
        final String input02 = br.readLine();
        System.out.print(solve(input01, input02));
    }

    private static int solve(String input01, String input02) {
        StringTokenizer st = new StringTokenizer(input02);
        // stock count for each item
        final int chickenSC = Integer.parseInt(input01);
        final int colaSC = Integer.parseInt(st.nextToken());
        final int beerSC = Integer.parseInt(st.nextToken());
        // return chicken count
        return Math.min((colaSC / 2 + beerSC), chickenSC);
    }

}