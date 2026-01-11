import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i <= n; i++) {
            String semi = sc.nextLine();

            if (semi.equals("Algorithm")) {
                System.out.println("204");
            } else if (semi.equals("DataAnalysis")) {
                System.out.println("207");
            } else if (semi.equals("ArtificialIntelligence")) {
                System.out.println("302");
            } else if (semi.equals("CyberSecurity")) {
                System.out.println("B101");
            } else if (semi.equals("Network")) {
                System.out.println("303");
            } else if (semi.equals("Startup")) {
                System.out.println("501");
            } else if (semi.equals("TestStrategy")) {
                System.out.println("105");
            }
        }
    }
}