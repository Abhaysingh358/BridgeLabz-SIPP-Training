package Methods;
import java.util.Scanner;
public class RootsOfQuadraticEquation{
	public double[] roots(double a , double b , double c) {
		
		double delta = Math.pow(b, 2) + 4*a*c;
		if(delta>0) {
			double root1 = (-b - Math.sqrt(delta))/(2*a);
			double  root2 = (-b - Math.sqrt(delta))/(2*a);
			return new double[] {root1,root2};
			 
		}
		else if(delta ==0){
			double roots = -b/(2*a);
			return new double[] {roots};
		}
		else {
			return new double[] {};
		}
		
	
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		RootsOfQuadraticEquation res = new RootsOfQuadraticEquation();
		double [] roots  =res.roots(a, b, c);
		if(roots.length == 2) {
			System.out.printf(roots[0] + ", " + roots[1]);
		}
		else if(roots.length == 1) {
			System.out.println(roots[0]);
		}
		else {
			System.out.println("no real roots");
		}
	}
}