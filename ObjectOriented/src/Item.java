package ObjectOriented.src;

public class Item {
    // Atributtes
    private String name;
    private int quantity;

    //Contructor
    public Item(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    // Getter method
    public String getName(){
        return name;
    }

    public int getQuantity() {
        return quantity;
    }
    // THIS IS CALLED ENCAPSULATION
}
