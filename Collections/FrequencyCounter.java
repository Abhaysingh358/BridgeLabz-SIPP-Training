package Collections;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class FrequencyCounter {
	static Map<String,Integer> map = new HashMap<>();
	
	public static void counter(String[] s) {
		
		for(String c : s) {
			map.put(c,map.getOrDefault(c,0)+1);
			
		}
	}
	public static void main(String[] args) {
		List<String> input = Arrays.asList("apple", "banana", "apple", "orange");
		
//		convert list to Array
		String[] array = input.toArray(new String[0]);
		
//		count frequency
		counter(array);
		System.out.println("Frequency Map: " + map);
		
		
	}
}
