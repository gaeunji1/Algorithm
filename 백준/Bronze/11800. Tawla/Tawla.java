import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();
        StringTokenizer st;

        String[] face = {"", "Yakk", "Doh", "Seh", "Ghar", "Bang", "Sheesh"};
        String[] dbl  = {"", "Habb Yakk", "Dobara", "Dousa", "Dorgy", "Dabash", "Dosh"};

        int T = Integer.parseInt(br.readLine().trim());
        for (int tc = 1; tc <= T; tc++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            int hi = Math.max(a, b), lo = Math.min(a, b);
            String phrase;
            if (hi == lo) {
                phrase = dbl[hi];                 // 더블
            } else if (hi == 6 && lo == 5) {
                phrase = "Sheesh Beesh";          // 6-5 특수 규칙
            } else {
                phrase = face[hi] + " " + face[lo]; // 일반 규칙
            }

            out.append("Case ").append(tc).append(": ").append(phrase).append('\n');
        }
        System.out.print(out.toString());
    }
}
