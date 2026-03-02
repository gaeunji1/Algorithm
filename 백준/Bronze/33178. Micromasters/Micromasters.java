import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int freeCourses = n / 10;
        
        System.out.println(freeCourses);
        
        sc.close();
    }
}