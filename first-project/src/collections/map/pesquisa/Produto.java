package collections.map.pesquisa;

public class Produto {
    private double price;
    private String name;
    private int amount;
    
    public Produto(String name, double price) {
        this.name = name;
        this.price = price;
    }

        //setters
    public void setQuantidade(int amount) { this.amount = amount; } 
    public void setPrice(double price) { this.price = price; }

        //getters
    public int getQuantidade() { return this.amount; }
    public String getNome() { return this.name; }
    public double getPreco() { return this.price; }

    @Override
    public String toString() {
        return "(" + name + ", " + price + ", " + amount + ")";
    }
}
