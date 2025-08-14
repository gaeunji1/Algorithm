import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int tc = sc.nextInt(); 

		for (int t = 1; t <= tc; t++) {
			
			int N = sc.nextInt();
			String[] robot = new String[N];
			int[] target = new int[N];

			for (int i = 0; i < N; i++) {
				robot[i] = sc.next(); 
				target[i] = sc.nextInt(); 
			}

			
			int bPosition = 1, oPosition = 1;

			
			int bTime = 0, oTime = 0;

			
			int totalTime = 0;

			for (int i = 0; i < N; i++) {
				
				if (robot[i].equals("B")) {
					
					int move = Math.abs(target[i] - bPosition);
					bTime += move + 1;
					if (bTime <= oTime) {
						bTime = oTime + 1;
					}
					totalTime = bTime;
					bPosition = target[i];

				}
				if (robot[i].equals("O")) {
					int move = Math.abs(target[i] - oPosition);
					oTime += move + 1;
					if (oTime <= bTime) {
						oTime = bTime + 1;
					}
					totalTime = oTime;
					oPosition = target[i];
				}
			}
			System.out.println("#" + t + " " + totalTime);
		}
	}
}