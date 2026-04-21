package ObjectOriented.src;

public class Fruit extends Item{
    //Inheritance
    private String type;

    public Fruit(String name, int quantity, String type) {
        super(name, quantity);
        this.type = type;
    }

    public String getType() {
        return type;
    }

}
