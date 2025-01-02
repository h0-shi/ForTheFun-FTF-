import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1546 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String leng[] = bf.readLine().split(" ");
		int result = 0;
		
		for (int i = 0; i < leng.length; i++) {
			if(leng[i].length() > 0) {
				result++;
			}
		}
		System.out.println(result);

	}
}