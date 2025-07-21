package HashMap;
import java.util.HashMap;
import java.util.Scanner;
class chaeckPair{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int target  = sc.nextInt();
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i =0; i<size;i++) {
			arr[i]=sc.nextInt();
		}
		
		
	}
	
	public boolean checkParitySum(int[] arr , int target) {
		boolean isParity = false;
		HashMap<Integer,Integer> mp = new HashMap<>();
		for(int i : arr) {
			mp.put(i ,mp.getOrDefault(arr[i], 0) + 1 );		
			}
	}
}