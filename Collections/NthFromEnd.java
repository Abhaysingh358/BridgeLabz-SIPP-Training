package Collections;

import java.util.LinkedList;
import java.util.ListIterator;

public class NthFromEnd {
	
	
	public static String findNthFromEnd(LinkedList<String> list , int n) {
		ListIterator<String> slow = list.listIterator();
		ListIterator<String> fast = list.listIterator();
		
		for(int i=0;i<n;i++) {
			if(fast.hasNext()) {
				fast.next();
				
			}
			else {
				return "N is larger than the list side";
			}
		}
		
		while(fast.hasNext()) {
			slow.next();
			fast.next();
			
		}
		
		return slow.next();
	}
	
	public static void main(String[] args) {
		LinkedList<String> list  = new LinkedList<>();
		list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        
        int N = 2;
        
        String result = findNthFromEnd(list,N);
        System.out.println("Nth element from the end is: " + result);
        
	}
	
	
}
