package Arrays;
import java.util.Scanner;
public class Mean{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] height = new double[11];
		double sum = 0;
		for(int i =0;i<height.length;i++) {
			height[i] = sc.nextInt();
		}
		for(int i = 0;i<height.length;i++) {
			sum += height[i];
		}
		double mean = sum/11;
		System.out.println(mean);
	}
}