import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main15552 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int quantity = Integer.parseInt(bf.readLine());
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		for (int i = 0; i < quantity; i++) {
			String test = bf.readLine();	
			String testArr[] = test.split(" ");
			int result = Integer.parseInt(testArr[0])+Integer.parseInt(testArr[1]); 
			bw.append(result+"\n");
		}
		bw.flush();
	}

}
