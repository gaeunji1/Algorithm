import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner 선언
        Scanner sc = new Scanner(System.in);

        int hour = sc.nextInt();
        int min = sc.nextInt();
        int hourMin;

        hourMin = (hour*60 + min)-45;

        hour = hourMin/60;
        min = hourMin%60;

        if (hour < 0 || min <0){
            int newHour = 23 -hour;
            int newMin = 60 + min;

            System.out.println(newHour);
            System.out.println(newMin);
        }
        else{
            System.out.println(hour);
            System.out.println(min);
        }

    }
}