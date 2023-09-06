package collections.set.ordenacao;

public class Produto implements Comparable<Produto> {
    private String name;
    private int id, amount;
    private double price;   

    public Produto(String name, int id) {
        this.name = name;
        this.id = id;
    }

    //Getters
    public String getName() { return name; }
    public int getId() { return id; }
    public int getAmount() { return amount; }
    public double getPrice() { return price; }

    //Setters
    public void setAmount(int amount) { this.amount = amount; }
    public void setPrice(double price) { this.price = price; }

    @Override
    public String toString() {
        return "{" + this.name + " - " + this.price + " - " + this.amount + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false;
        if(obj.getClass() != this.getClass()) return false;
        Produto p = (Produto) obj;
        return this.id == p.getId();
    }

    @Override
    public int hashCode() {
        return this.id;
    }

    @Override
    public int compareTo(Produto p) {
        return this.name.compareToIgnoreCase(p.getName());
    }
}
