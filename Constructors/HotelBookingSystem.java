package Constructors;

class HotelBooking{
	String guestName;
	String roomType;
	int nights;
//	default constructor
	public HotelBooking() {
		this("Abhay Pratp Singh" , "single" , 3);
		}
	
	 // Setters to change values
    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public void setNights(int nights) {
        this.nights = nights;
    }
	
	// Parameterized constructor
	public HotelBooking(String guestName,String roomType,int nights) {
		this.guestName = guestName;
		this.roomType = roomType;
		this.nights = nights;
		
	}
	// copy constructor
	public HotelBooking(HotelBooking H) {
		this.guestName = H.guestName;
		this.roomType = H.roomType;
		this.nights = H.nights;
		
	}
	
	public void print() {
		System.out.println("guestname : " + guestName);
		System.out.println("Room type : " + roomType);
		System.out.println("nights : " + nights);
	}
	
}

// main method
public class HotelBookingSystem{
	public static void main(String[] args) {
		HotelBooking defaultHotelBooking = new HotelBooking();
		defaultHotelBooking.print();
		
//		calling parameterized constructor
		HotelBooking H1 = new HotelBooking("Sumit Parihar" , "2 seater" , 3);
		H1.print();
		
// copy constructor
		HotelBooking H2 = new HotelBooking(H1);
		H2.setGuestName("Shivam");
		H2.setRoomType("single seater(non-AC)");
		H2.setNights(4);
		H2.print();
		
		
		
		
	}
}
