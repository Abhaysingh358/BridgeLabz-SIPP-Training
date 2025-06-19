package Methods;
import java.util.Scanner;
public class EuclideanDistance{
	public static double distance(double x1 , double y1 , double x2 ,double y2 ) {
		double dx = Math.pow(x2 - x1, 2);
        double dy = Math.pow(y2 - y1, 2);
        return Math.sqrt(dx + dy);
	}
	public static double[] equation(double x1 , double y1 , double x2 ,double y2 ) {
		double slope = (y2-y1) / (x2-x1);
		double b = y1  - slope*x1;
		double[]  arr = new double[2];
		return new double[]  {slope , b};
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x1 = sc.nextDouble();
		double x2 = sc.nextDouble();
		double y1 = sc.nextDouble();
		double y2 = sc.nextDouble();
		System.out.println("distance :" + distance(x1,x2,y1,y2));
		double[] ans = equation(x1,x2,y1,y2);
		System.out.println("slope : " + ans[0]);
		System.out.println("y intercept : " + ans[1]);
	}
}