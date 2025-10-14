import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int by = Integer.parseInt(st.nextToken());
        int bm = Integer.parseInt(st.nextToken());
        int bd = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int cy = Integer.parseInt(st.nextToken());
        int cm = Integer.parseInt(st.nextToken());
        int cd = Integer.parseInt(st.nextToken());

        // 만 나이: 생일 전이면 -1
        int man = cy - by;
        if (cm < bm || (cm == bm && cd < bd)) man--;

        // 세는 나이: 태어난 해 1세, 해가 바뀌면 +1
        int counting = cy - by + 1;

        // 연 나이: 현재 연도 - 출생 연도
        int year = cy - by;

        System.out.println(man);
        System.out.println(counting);
        System.out.println(year);
    }
}
