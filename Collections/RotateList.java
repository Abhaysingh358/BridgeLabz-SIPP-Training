package Collections;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;
public class RotateList {
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10,20,30,40,50);
		Collections.rotate(list, -2);
		
		System.out.println("Rotated List : " + list);
	}
}
