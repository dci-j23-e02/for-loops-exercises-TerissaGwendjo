import java.util.Arrays;

public class GroceryStoreInventory {
    public static void main(String[] args) {
        String[] inventory = {"Apples","Bananas","Oranges"}; //Array of strings named inventory created
        // and initialized with 3 items namely....

        if (inventory.length == 0) {
            System.out.println("The inventory is empty.");
            // This if statement checks the length of the inventory array. The .length property of an array returns
            // the number of elements it contains.
            //If the length of the array is 0 (i.e., there are no items in the inventory), the code inside the if block
            // is executed, and it prints "The inventory is empty."
            //If the inventory is not empty (i.e., it contains at least one item), the code inside the else block is executed.
        } else {
            // Bonus: Sort the inventory alphabetically
            Arrays.sort(inventory);

            System.out.print("Inventory: ");
            for (String item : inventory) { //a for-each loop starts
                System.out.print(item);
                //In this loop, for (String item : inventory), the following happens:
                //String item: This declares a new variable item of type String. This variable is used to represent
                // each element in the inventory array during each iteration of the loop.
                //: inventory: The colon (:) is used to iterate over each element in the inventory array. It indicates
                // that the loop is going to traverse the elements of the array.
                //The loop iterates over each element in the inventory array, and during each iteration, the item
                // variable takes on the value of the current element.

                if (!item.equals(inventory[inventory.length - 1])) {
                    System.out.print(", ");
                    //After printing each item, the code checks if the item is not the last item in the inventory array.
                    // It does this by comparing the current item to the last item in the array,
                    // which is inventory[inventory.length - 1]. If the item is not the last one, a comma and a space
                    // are printed to separate it from the next item.
                }
            }
            System.out.println(); // Print a new line for clarity
        }
    }
}
