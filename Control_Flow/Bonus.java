package Control_Flow;
import java.util.Scanner;
public class Bonus{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double years = sc.nextDouble();
		double salary = sc.nextDouble();
		double rate = (salary*5)/100;
		double bonus = rate*years;
		System.out.println(bonus);
	}
}
