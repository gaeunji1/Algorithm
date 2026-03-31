import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine().trim();

        LocalDate topcDate = LocalDate.parse(input);
        LocalDate deadline = LocalDate.of(2023, 10, 21).minusDays(35);

        if (topcDate.isAfter(deadline)) {
            System.out.println("TOO LATE");
        } else {
            System.out.println("GOOD");
        }
    }
}