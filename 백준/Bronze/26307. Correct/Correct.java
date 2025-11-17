import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int HH = sc.nextInt();
        int MM = sc.nextInt();

        // contest start: 9:00 AM
        int startHour = 9;
        int startMinute = 0;

        // convert both times to minutes from midnight
        int startTotal = startHour * 60 + startMinute;
        int submitTotal = HH * 60 + MM;

        // consumed time
        int consumed = submitTotal - startTotal;

        System.out.println(consumed);
    }
}
