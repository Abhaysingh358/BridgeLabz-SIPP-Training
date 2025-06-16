package Arrays;
import java.util.Scanner;
public class multi_to_single_dimension{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int rows = sc.nextInt();
	int cols = sc.nextInt();
	int[][] arr1 = new int[rows][cols];
	
	for(int i=0;i<rows;i++) {
		for(int j=0;j<cols;j++) {
			arr1[i][j]  = sc.nextInt();
		}
	}
	int index = 0;
	int[] arr2 = new int[rows*cols];
	for(int i=0;i<rows;i++) {
		for(int j=0;j<cols;j++) {
			arr2[index] =arr1[i][j];
			System.out.println(arr2[index]);
			index++;
			
		}
		
	}
	
}
}