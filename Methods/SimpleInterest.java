package Methods;
import java.util.Scanner;
public class SimpleInterest{
	public double SI(double principle , double rate , double time) {
		double si = (principle*rate*time)/100;
		return si;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enetr the value respectively : principle ,rate,time");
		double principle = sc.nextDouble();
		double rate = sc.nextDouble();
		double time = sc.nextDouble();
		SimpleInterest si = new SimpleInterest();
		
		double s = si.SI(principle,rate,time);
		System.out.println(s);
		
	}
}