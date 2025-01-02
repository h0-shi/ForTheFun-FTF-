import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main11022 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int testCase = Integer.parseInt(bf.readLine());
		for (int i = 0; i < testCase; i++) {
			String arr[] = bf.readLine().split(" ");
			int count = i+1;
			int result = Integer.parseInt(arr[0])+Integer.parseInt(arr[1]);
			bw.append("Case #"+count+": "+result+"\n");
		}
		bw.flush();
	}
}
