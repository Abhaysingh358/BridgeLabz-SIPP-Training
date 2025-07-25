package smartWarehouseManagementSystem;

import java.util.List;
public class WarehouseUtils {
	public static void DisplayAllItems(List <? extends WarehouseItem> items) {
		for(WarehouseItem item : items) {
			item.displayInfo();
		}
	}
}
