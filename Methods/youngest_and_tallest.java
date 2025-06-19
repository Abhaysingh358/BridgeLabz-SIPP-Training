package Methods;
import java.util.Scanner;
public class youngest_and_tallest{
	public static double  tallest(double h1 , double h2, double h3) {
		if(h1<h2) {
			if(h2<h3) {
				return h3;
			}
			else  {
				return h2;
			}
		}
		else {
			return h1;
		}
		
	}
	public static double age(double age1,double age2, double age3) {
		if(age1>age2) {
			if(age2>age3) {
				return age3;
			}
			else {
				return age2;
			}
		}
		else {
			return age1;
		}
		}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double h1 = sc.nextDouble();
		double h2 = sc.nextDouble();
		double h3 = sc.nextDouble();
		double age1 = sc.nextDouble();
		double age2 = sc.nextDouble();
		double age3 = sc.nextDouble();
		System.out.println("youngest" + age(age1,age2,age3) );
		System.out.println("tallest" + tallest(h1,h2,h3));
	}
}