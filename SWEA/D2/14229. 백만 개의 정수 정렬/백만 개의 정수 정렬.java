import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int[] arr = new int[1000000];
 
        for (int i = 0; i < 1000000; i++) {
            arr[i] = sc.nextInt();
        }
 
        Arrays.sort(arr);
        System.out.println(arr[500000]);
	}
}
