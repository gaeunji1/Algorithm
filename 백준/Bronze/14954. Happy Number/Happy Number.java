import java.io.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.print(isHappy(n) ? "HAPPY" : "UNHAPPY");
    }

    static boolean isHappy(int n) {
        int slow = getDigitSum(n);
        int fast = getDigitSum(getDigitSum(n));
                               
        while (fast != 1 && slow != 1) {
            if (fast == slow) {
                return false;
            }
            
            slow = getDigitSum(slow);
            fast = getDigitSum(getDigitSum(fast));
        }

        return true;
    }
    
    static int getDigitSum(int number) {
        int sum = 0;
        
        while (number != 0) {
            sum += (number % 10) * (number % 10);
            number /= 10;
        }
        
        return sum;
    }   
}