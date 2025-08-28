import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] age = new int[n];
        String[] name = new String[n];

        for (int i = 0; i < n; i++) {
            age[i] = sc.nextInt();
            name[i] = sc.next();
        }

        Integer[] idx = new Integer[n];
        for (int i = 0; i < n; i++) idx[i] = i;

        Arrays.sort(idx, new Comparator<Integer>() {
            @Override
            public int compare(Integer i, Integer j) {
                int c = Integer.compare(age[i], age[j]); // 나이 오름차순
                if (c != 0) return c;
                return Integer.compare(i, j);            // 같은 나이는 입력 순서 유지
            }
        });

        StringBuilder sb = new StringBuilder();
        for (int id : idx) {
            sb.append(age[id]).append(' ').append(name[id]).append('\n');
        }
        System.out.print(sb.toString());
        sc.close();
    }
}
