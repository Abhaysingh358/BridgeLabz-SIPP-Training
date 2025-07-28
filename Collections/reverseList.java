package Collections;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class reverseList{
	public static <T> void reverse(List<T> list ) {
		int left = 0;
		int right = list.size()-1;;
		while(left<right) {
			T temp = list.get(left);
			list.set(left ,list.get(right));
			list.set(right , temp);
			left++;
			right--;
			
		}
	}
	
	public static void main(String[] args) {
		
//		add elements in arraysList
		List <Integer> arrayList = new ArrayList<>();
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(30);
		arrayList.add(40);
		arrayList.add(50);
		
		 System.out.println("Original ArrayList: " + arrayList);
	        reverse(arrayList);
	        System.out.println("Reversed ArrayList: " + arrayList);
	        
//add elements in linkedList
	        List<Integer> linkedList = new LinkedList<>();
	        linkedList.add(10);
	        linkedList.add(20);
	        linkedList.add(30);
	        linkedList.add(40);
	        linkedList.add(50);
	        
	        System.out.println("\nOriginal LinkedList: " + linkedList);
	        reverse(linkedList);
	        System.out.println("Reversed LinkedList: " + linkedList);
	        
	}
	
	
	
	
}