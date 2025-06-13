package Java_programming_Elements;
	public class compute_volume{
		public static void main(String[] args) {
			double r = 6378;
			double volume = (4/3)*3.14*r*r*r;
			double volume_in_miles = volume*0.62;
			System.out.print(" The volume of earth in cubic kilometers is " + volume + " and cubic miles is "
					+ volume_in_miles);
		}
	}
