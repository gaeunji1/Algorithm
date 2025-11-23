import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sleep = Integer.parseInt(br.readLine().trim()); // 첫 줄: 자는 시간
        int wake = Integer.parseInt(br.readLine().trim());  // 둘째 줄: 알람 시간

        int hours;
        if (wake >= sleep) {
            // 같은 날 안에서 알람이 울리는 경우 (예: 0시 ~ 5시, 3시 ~ 10시)
            hours = wake - sleep;
        } else {
            // 자정(24시)을 넘어가는 경우 (예: 22시 ~ 5시, 23시 ~ 8시)
            hours = (24 - sleep) + wake;
        }

        System.out.println(hours); // 조건: 딱 한 개의 정수만 출력
    }
}
