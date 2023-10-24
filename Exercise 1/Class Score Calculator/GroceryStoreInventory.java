import java.util.Arrays;

public class GroceryStoreInventory {
    public static void main(String[] args) {
        String[] inventory = {"Apples", "Bananas", "Oranges"};

        if (inventory.length == 0) {
            System.out.println("The inventory is empty.");
        } else {
            // Bonus: Sort the inventory alphabetically
            Arrays.sort(inventory);

            System.out.print("Inventory: ");
            for (String item : inventory) {
                System.out.print(item);
                if (!item.equals(inventory[inventory.length - 1])) {
                    System.out.print(", ");
                }
            }
            System.out.println(); // Print a new line for clarity
        }
    }
}
