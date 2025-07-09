package LinkedList;

class ItemNode {
    String itemName;
    int itemId;
    int quantity;
    double price;
    ItemNode next;

    public ItemNode(String itemName, int itemId, int quantity, double price) {
        this.itemName = itemName;
        this.itemId = itemId;
        this.quantity = quantity;
        this.price = price;
        this.next = null;
    }
}

public class InventoryManagementSystem {
    ItemNode head;

    // Add at beginning
    public void addFirst(String name, int id, int qty, double price) {
        ItemNode newNode = new ItemNode(name, id, qty, price);
        newNode.next = head;
        head = newNode;
    }

    // Add at end
    public void addLast(String name, int id, int qty, double price) {
        ItemNode newNode = new ItemNode(name, id, qty, price);
        if (head == null) {
            head = newNode;
            return;
        }
        ItemNode curr = head;
        while (curr.next != null)
            curr = curr.next;
        curr.next = newNode;
    }

    // Add at specific position
    public void addAtPosition(int pos, String name, int id, int qty, double price) {
        if (pos <= 1 || head == null) {
            addFirst(name, id, qty, price);
            return;
        }
        ItemNode newNode = new ItemNode(name, id, qty, price);
        ItemNode curr = head;
        int count = 1;
        while (curr != null && count < pos - 1) {
            curr = curr.next;
            count++;
        }
        if (curr == null || curr.next == null) {
            addLast(name, id, qty, price);
        } else {
            newNode.next = curr.next;
            curr.next = newNode;
        }
    }

    // Remove by ID
    public void removeById(int id) {
        if (head == null) return;
        if (head.itemId == id) {
            head = head.next;
            return;
        }
        ItemNode curr = head;
        while (curr.next != null && curr.next.itemId != id)
            curr = curr.next;
        if (curr.next != null)
            curr.next = curr.next.next;
    }

    // Update quantity by ID
    public void updateQuantity(int id, int newQty) {
        ItemNode curr = head;
        while (curr != null) {
            if (curr.itemId == id) {
                curr.quantity = newQty;
                return;
            }
            curr = curr.next;
        }
        System.out.println("Item not found.");
    }

    // Search by ID
    public void searchById(int id) {
        ItemNode curr = head;
        while (curr != null) {
            if (curr.itemId == id) {
                printItem(curr);
                return;
            }
            curr = curr.next;
        }
        System.out.println("Item not found.");
    }

    // Search by name
    public void searchByName(String name) {
        ItemNode curr = head;
        boolean found = false;
        while (curr != null) {
            if (curr.itemName.equalsIgnoreCase(name)) {
                printItem(curr);
                found = true;
            }
            curr = curr.next;
        }
        if (!found)
            System.out.println("Item not found.");
    }

    // Calculate total value
    public double calculateTotalValue() {
        double total = 0;
        ItemNode curr = head;
        while (curr != null) {
            total += curr.quantity * curr.price;
            curr = curr.next;
        }
        return total;
    }

    // Sort by name
    public void sortByName(boolean ascending) {
        head = mergeSort(head, "name", ascending);
    }

    // Sort by price
    public void sortByPrice(boolean ascending) {
        head = mergeSort(head, "price", ascending);
    }

    private ItemNode mergeSort(ItemNode node, String criteria, boolean ascending) {
        if (node == null || node.next == null)
            return node;

        ItemNode middle = getMiddle(node);
        ItemNode nextOfMiddle = middle.next;
        middle.next = null;

        ItemNode left = mergeSort(node, criteria, ascending);
        ItemNode right = mergeSort(nextOfMiddle, criteria, ascending);

        return sortedMerge(left, right, criteria, ascending);
    }

    private ItemNode sortedMerge(ItemNode a, ItemNode b, String criteria, boolean ascending) {
        if (a == null) return b;
        if (b == null) return a;

        boolean condition;
        if (criteria.equals("name")) {
            condition = ascending ? a.itemName.compareToIgnoreCase(b.itemName) <= 0
                                  : a.itemName.compareToIgnoreCase(b.itemName) > 0;
        } else { // price
            condition = ascending ? a.price <= b.price : a.price > b.price;
        }

        ItemNode result;
        if (condition) {
            result = a;
            result.next = sortedMerge(a.next, b, criteria, ascending);
        } else {
            result = b;
            result.next = sortedMerge(a, b.next, criteria, ascending);
        }
        return result;
    }

    private ItemNode getMiddle(ItemNode head) {
        if (head == null) return head;
        ItemNode slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // Print single item
    private void printItem(ItemNode node) {
        System.out.println("Item Name: " + node.itemName + ", ID: " + node.itemId + ", Qty: " + node.quantity + ", Price: " + node.price);
    }

    // Print all items
    public void printInventory() {
        ItemNode curr = head;
        while (curr != null) {
            printItem(curr);
            curr = curr.next;
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        InventoryManagementSystem ims = new InventoryManagementSystem();
        ims.addLast("Mouse", 101, 10, 250.0);
        ims.addFirst("Keyboard", 102, 5, 500.0);
        ims.addAtPosition(2, "Monitor", 103, 2, 5000.0);
        ims.printInventory();

        System.out.println("\nTotal Inventory Value: " + ims.calculateTotalValue());

        System.out.println("\nUpdating quantity of ID 102 to 20:");
        ims.updateQuantity(102, 20);
        ims.printInventory();

        System.out.println("\nSearching by ID 103:");
        ims.searchById(103);

        System.out.println("\nRemoving item ID 101:");
        ims.removeById(101);
        ims.printInventory();

        System.out.println("\nSorting by Price (Descending):");
        ims.sortByPrice(false);
        ims.printInventory();

        System.out.println("\nSorting by Name (Ascending):");
        ims.sortByName(true);
        ims.printInventory();
    }
}
