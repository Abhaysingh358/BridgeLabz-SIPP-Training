package smartWarehouseManagementSystem;

public abstract class WarehouseItem {
	private String name;
	private double price;
	
	public WarehouseItem(String name, double price) {
        this.name = name;
        this.price = price;
    }
	
	public abstract  String getCategory();
		
	public String getName(){
			return name;
		}
		
	public double getPrice(){
			return price;
		}
	public void displayInfo() {
        System.out.println(getCategory() + " - " + name + ": $" + price);
    }
}
