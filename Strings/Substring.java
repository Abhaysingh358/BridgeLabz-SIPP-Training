package Strings;
import java.util.Scanner;
public class Substring{
	public static String str(String s ,int start , int end) {
		StringBuilder sb = new StringBuilder();
		
		for(int i=start;i<=end;i++) {
			char c = s.charAt(i);
			sb.append(c);
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		boolean res = false;
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter string");
		String s = scanner.next();
		int n = s.length();
		System.out.print("start index and it shoul be start between 1 to length of string");
		int start  =scanner.nextInt();
		
		int end  = scanner.nextInt();
		String sub = s.substring(start,end); 
		String s1 =  str(s,start,end);
		System.out.println(s1);
		System.out.println(sub);
		
		if(sub.equals(s1)){
			res = true;
			System.out.print(res);
		}
		else {
			System.out.print(res);
		}
		
		
	}
}