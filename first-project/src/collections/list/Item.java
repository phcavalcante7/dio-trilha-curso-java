package collections.list;

public class Item {
    private String name;
    private double price;
    private int amount;

    public Item(String name, double price, int amount) { //constructor
        this.name = name;
        this.price = price;
        this.amount = amount;
    }
        //getters
    public String getName() { 
        return name;
    }
    public double getPrice() {
        return price;
    }
    public int getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "{Item: " + name + " - " + "Preço = " + price + " - " + "Possui " + amount + " unidades}";
    }
}
