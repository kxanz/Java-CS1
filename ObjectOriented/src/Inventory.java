package ObjectOriented.src;
import java.util.ArrayList;

public class Inventory {

    private ArrayList<Item> items;

    //constructor 
    public Inventory() {
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(items);
    }

    public void displayInventory(){
        for (Item item : items) {
            System.out.println("Item:" +item.getName() + ", Quantity: " + item.getQuantity());
        }
    }
}
