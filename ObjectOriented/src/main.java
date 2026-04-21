package ObjectOriented.src;

public class main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        
        Item item1 = new Item("Generic Item", 20);
        Fruit fruit = new Fruit("Apple", 20, "Fhi");

        inventory.addItem(item1);
        inventory.addItem(fruit);
        inventory.displayInventory();
    }
}
