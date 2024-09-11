import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // Create an inventory manager
        InventoryManager inventory1 = new InventoryManager();
        
        // Start the inventory management system
        build(inventory1);
    }
    
    public static void build(InventoryManager inventory) {
        // Variables
        boolean exit = false;
        Scanner scanner = new Scanner(System.in);

        // Main menu
        System.out.println("\nWelcome to Abdullah's >Inventory Management System!<");

        // Loop until the user exits
        do {
            // Display the menu
            System.out.println("_______________________________________________________");
            System.out.println("What would you like to do?");
            System.out.println("1) Add an Item.\n2) Remove an Item\n3) Update an Item.\n4) List Items.\n5) Exit.");
            System.out.println("_______________________________________________________");
            
            // Get the user's input
            System.out.print("Choose an option>> ");
            int choice;
            do
                choice = scanner.nextInt();
            while (choice < 1 || choice > 5);

            // Variables
            int id; String name; double price; int quantity;
            
            switch (choice) {
                case 1:
                // Add an item
                    System.out.println("\nGreat! We'll add an item to the inventory.");
                    System.out.print("Enter the item ID: ");
                    id = scanner.nextInt();
                    System.out.print("Enter the item name: ");
                    name = scanner.next();
                    System.out.print("Enter the item price: ");
                    price = scanner.nextDouble();
                    System.out.print("Enter the item quantity: ");
                    quantity = scanner.nextInt();

                    id = (InventoryManager.removedID == 0)? InventoryManager.idCount : InventoryManager.removedID;
                    inventory.addItem(new Item(id, name, price, quantity));
                    break;

                case 2:
                // Remove an item
                    System.out.println("\nSure! We'll remove an item from the inventory.");
                    System.out.print("Enter the item ID: ");
                    id = scanner.nextInt();

                    inventory.removeItem(id);
                    break;

                case 3:
                // update the item
                    System.out.println("\nWe'll update an item in the inventory.");
                    System.out.print("Enter the item ID: ");
                    id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter the attribute to update: ");
                    String attribute = scanner.next();
                    System.out.print("Enter the new value: ");
                    String value = scanner.next();

                    inventory.updateItem(id, attribute.toLowerCase(), value);
                    break;

                case 4:
                // list all items
                    System.out.println("\nHere's the list of all the items in the inventory:");

                    inventory.listItems();
                    break;

                case 5:
                // exit
                    exit = true;
                    break;
            }

        } while (!exit);
        scanner.close();
    }
}