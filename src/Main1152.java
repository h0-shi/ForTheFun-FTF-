import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1152 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int qtt = Integer.parseInt(bf.readLine());
		String point[] = bf.readLine().split(" ");
		double intPoint[]= new double[point.length];
		double max = 0;
		double sum = 0;
		for (int i = 0; i < point.length; i++) {
			intPoint[i] = Integer.parseInt(point[i]);
			if(intPoint[i]> max) {
				max = intPoint[i];
			}
		}
		for (int i = 0; i < qtt; i++) {
			sum += intPoint[i]/max;
		}
		System.out.println(sum*100/qtt);
	}
}