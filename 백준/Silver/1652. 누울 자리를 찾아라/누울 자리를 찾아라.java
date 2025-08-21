import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();

        String[] grid = new String[N];
        for (int i = 0; i < N; i++) grid[i] = sc.next();

        int horiz = 0, vert = 0;

        // 가로
        for (int i = 0; i < N; i++) {
            int cnt = 0;
            for (int j = 0; j < N; j++) {
                if (grid[i].charAt(j) == '.') cnt++;
                else { if (cnt >= 2) horiz++; cnt = 0; }
            }
            if (cnt >= 2) horiz++;
        }

        // 세로
        for (int j = 0; j < N; j++) {
            int cnt = 0;
            for (int i = 0; i < N; i++) {
                if (grid[i].charAt(j) == '.') cnt++;
                else { if (cnt >= 2) vert++; cnt = 0; }
            }
            if (cnt >= 2) vert++;
        }

        System.out.println(horiz + " " + vert);
    }
}
