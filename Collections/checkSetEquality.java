package Collections;

import java.util.Set;
import java.util.HashSet;


public class checkSetEquality {
	 
	public static boolean areSetEqual(Set<Integer> s1 , Set<Integer> s2) {
		return s1.equals(s2);	
		}
	public static void main (String[] args) {
		
		Set<Integer> s1 = new HashSet<>();
		s1.add(1);
        s1.add(2);
        s1.add(3);

        Set<Integer> s2 = new HashSet<>();
        s2.add(3);
        s2.add(2);
        s2.add(1);
        
        boolean ans = areSetEqual(s1,s2);
        System.out.println("Are the two sets equal? " + ans);
	}
}
