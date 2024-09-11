import java.util.ArrayList;

public class InventoryManager {
    // Attributes
    private ArrayList<Item> inventory;
    public static int idCount = 1;
    public static int removedID = 0;

    // Constructors
    public InventoryManager() {
        // Initialize the inventory
        inventory = new ArrayList<Item>();
    }

    public InventoryManager(ArrayList<Item> inventory) {
        // Initialize the inventory with a list of items
        this.inventory = inventory;
    }

    public InventoryManager(InventoryManager inventoryManager) {
        // Copy the inventory
        this.inventory = inventoryManager.inventory;
    }

    // Methods
    public void addItem(Item item) {
        // Add an item to the inventory
        inventory.add(item);
        if (removedID == 0) idCount++;
        else removedID = 0;
        System.out.println("[+]Item added successfully!");
    }

    public Item getItem(int id) {
        // Get an item from the inventory
        for (Item item : inventory)
            if (item.getId() == id) {
                return item;
            }
        return null;
    }

    public void removeItem(int id) {
        // Remove an item from the inventory
        for (Item item : inventory)
            if (item.getId() == id) {
                inventory.remove(item);
                System.out.println("[+]Item removed successfully!");
                removedID = id;
                idCount--;
                break;
            }
    }

    public void updateItem(int id, String attribute, String value) {
        // Update an item in the inventory
        for (Item item : inventory)
            if (item.getId() == id)
                switch (attribute) {
                    case "name":
                        item.setName(value);
                        System.out.println("[+]Item name updated successfully!");
                        break;
                    case "price":
                        item.setPrice(Double.parseDouble(value));
                        System.out.println("[+]Item price updated successfully!");
                        break;
                    case "quantity":
                        item.setQuantity(Integer.parseInt(value));
                        System.out.println("[+]Item quantity updated successfully!");
                        break;
                    case "id":
                        item.setId(Integer.parseInt(value));
                        System.out.println("[+]Item ID updated successfully!");
                        break;
                }
    }

    public void listItems() {
        // List all items in the inventory
        System.out.println("> INVENTORY <");
        System.out.printf("  | %5s|\t %10s|\t %10s|\t %8s|\n----------------------------------------------------------\n",
        "ID", "NAME", "PRICE", "QUANTITY");
        
        for (Item item : inventory) {
            System.out.printf("  | %5d|\t %10s|\t %10.2f|\t %8d|\n", item.getId(), item.getName(), item.getPrice(), item.getQuantity());
            System.out.println("  ----------------------------------------------------------");
        }
    }
}
