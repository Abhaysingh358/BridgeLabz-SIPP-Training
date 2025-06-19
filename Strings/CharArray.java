package Strings;
import java.util.Scanner;
public class CharArray{
	public static char[] arr(String s) {
		int n = s.length();
		char[]  c = new char[n];
		for(int i=0;i<n;i++) {
			c[i] = s.charAt(i);
			 
		}
		return c;
	}
	
	public static boolean compare(char[] a , char[] b) {
		if(a.length != b.length) {
			return false;
		}
		 for (int i = 0; i < a.length; i++) {
	            if (a[i] != b[i]) {
	                return false;
	            }
	        }
	        return true;
	    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String s = sc.next();
		
		char[] BuiltInMethod = s.toCharArray();
		
		char[] custom = arr(s);
		
		boolean res = compare(BuiltInMethod,custom);
		
		for(char c : BuiltInMethod) {
			System.out.print(c + " ");
		
		}
		
		for(char c : custom) {
			System.out.print(c + " ");
		
		}
		System.out.println(res);
		
		
	}
}