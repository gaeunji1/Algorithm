import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		
		for(int t = 1; t <= tc; t++) {
			// input
			int aLen = sc.nextInt();
			int bLen = sc.nextInt();
			
			int[] aArr = new int[aLen];
			int[] bArr = new int[bLen];
			
			for(int i = 0; i<aLen ; i++) {
				aArr[i] = sc.nextInt();
			}
			for(int i = 0; i<bLen ; i++) {
				bArr[i] = sc.nextInt();
			}
			
			int maxResult = 0;
			int sum = 0;
			
			// 중간(aLen이 더 큰 경우)
			if(aLen >= bLen) {
				for(int i = 0; i <= aLen - bLen; i++) {
					sum = 0;
					for(int j = 0; j < bLen; j++) {
						sum += bArr[j] * aArr[i+j];
					}
					if(maxResult < sum) {
						maxResult = sum;
					}
				}
			}
			
			// 중간(bLen이 더 큰 경우)
			if(bLen > aLen) {
				for(int i = 0; i <= bLen - aLen; i++) {
					sum = 0;
					for(int j = 0; j < aLen; j++) {
						sum += aArr[j] * bArr[i+j];
					}
					if(maxResult < sum) {
						maxResult = sum;
					}
				}
			}
			
			// 출력
			System.out.println("#"+ t + " " + maxResult);
			
		}	// 테스트케이스
	}
}
