package Control_Flow;
import java.util.Scanner;
public class check_spring_season{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the month");
		String month = sc.nextLine();
		System.out.println("enter the day");
		int day = sc.nextInt();
		if((month.equals("may") && day >=1 && day <=20) || (month.equals("apr") && day <=30 && day>=1)
				|| (month.equals("may") && day>=1 && day <=31) || (month.equals("mar") && day <=20 && day>=1) ) {
			System.out.println("Spring Season ");
		}
		else {
			System.out.println("not a spring season");
		}
		
//		System.out.println(month.equals("apr"));
//		
//		
//		ques == vs .equals
		
//		int a = 4;
//		a= 5;
//		
//		String s = "A";
////		s = "B";
//		
//		String s1 = "A";
//		
//		System.out.println(s == s1);
//		System.out.println(s.equals(s1));
//				
//				
		;
		
	}
}