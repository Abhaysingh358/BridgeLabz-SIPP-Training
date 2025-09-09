package JavaExceptions;

public class Employee {
	String userName;
	String password;
	
	public Employee(String userName , String password) {
		this.userName = userName;
		this.password = password;
	}
	
	  @Override
	  public String toString() {
	        return this.userName;
	    }
	
	
	
}
