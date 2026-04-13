import java.io.*;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			int sum = 0;
			
			for(int i = 0; i < 4; i++) {
				sum += Integer.parseInt(br.readLine());
			}
			
			if(sum <= 1500) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
	}

}