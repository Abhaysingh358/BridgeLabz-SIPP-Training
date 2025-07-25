package smartWarehouseManagementSystem;

public class SmartWarehouseApp {
	public static void main(String[] args) {
		Storage <Electronics> electronisStorage = new Storage<>();
		Storage<Groceries> groceriesStorage = new Storage<>();
        Storage<Furniture> furnitureStorage = new Storage<>();
        

		//        Adding items 
        electronisStorage.addItem(new Electronics("Smartphone", 999.99));
        electronisStorage.addItem(new Electronics("Laptop", 1299.50));

        groceriesStorage.addItem(new Groceries("Apple", 1.49));
        groceriesStorage.addItem(new Groceries("Bread", 2.99));

        furnitureStorage.addItem(new Furniture("Chair", 49.99));
        furnitureStorage.addItem(new Furniture("Table", 109.99));
        
        
        // Display using generic method
        System.out.println("=== Electronics ===");
        electronisStorage.displayItems();

        System.out.println("\n=== Groceries ===");
        groceriesStorage.displayItems();

        System.out.println("\n=== Furniture ===");
        furnitureStorage.displayItems();
        
        
        // Display using wildcard method
        System.out.println("\n=== Display All Items Using Wildcard Method ===");
        WarehouseUtils.DisplayAllItems(electronisStorage.getAllItems());
        WarehouseUtils.DisplayAllItems(groceriesStorage.getAllItems());
        WarehouseUtils.DisplayAllItems(furnitureStorage.getAllItems());
	}
}
