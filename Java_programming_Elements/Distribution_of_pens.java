package Java_programming_Elements;

public class Distribution_of_pens{
	public static void main(String[] args) {
		int total_pens = 14;
		int Student = 3;
		int Equally_divided  = total_pens/Student;
		int remained = total_pens % Student;
		System.out.print("The Pen Per Student is " + Equally_divided + " and the remaining pen not distributed is "
				+ remained);
		
	}
}