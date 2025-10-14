import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String me = br.readLine().trim();          // 진호의 MBTI
        int N = Integer.parseInt(br.readLine().trim());
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            if (me.equals(br.readLine().trim())) cnt++;
        }
        System.out.println(cnt);
    }
}
