import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main11021 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int testCase = Integer.parseInt(bf.readLine());
		for (int i = 0; i < testCase; i++) {
			String arr[] = bf.readLine().split(" ");
			int count = i+1;
			int first = Integer.parseInt(arr[0]);
			int second = Integer.parseInt(arr[1]);
			int result = first+second;
			bw.append("Case #"+count+": "+first+" + "+second+" = "+result+"\n");
		}
		bw.flush();
	}
}
