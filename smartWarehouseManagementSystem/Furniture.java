package smartWarehouseManagementSystem;

public class Furniture extends WarehouseItem {

	public Furniture(String name, double price) {
		super(name, price);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String getCategory() {
		return "Furniture";
	}

}
