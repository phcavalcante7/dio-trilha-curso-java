package collections.list;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> list;

    public CarrinhoDeCompras() {
        this.list = new ArrayList<Item>();
    }

    public void addItem(String name, double price, int amount) {
        Item item = new Item(name, price, amount);
        list.add(item);
    }

    public void removerItem(String name) {
        for (Item item : list) {
            if (item.getName().equals(name)) {
                list.remove(item);
                break;
            }
        }
    }

    public double calcularValorTotal() {
        double finalPrice = 0;
        for (Item item : list) {
            finalPrice += item.getPrice() * item.getAmount();
        }
        return finalPrice;
    }

    public void printCarrinho() {
        System.out.println(list);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras mercado = new CarrinhoDeCompras();
        

        mercado.addItem("Leite", 5.30, 4);
        mercado.addItem("Requeijão", 4.10, 2);
        mercado.addItem("Ovos", 20.50, 1);
        
        System.out.println("Price before remove: " + mercado.calcularValorTotal()); 

        mercado.removerItem("Ovos");

        System.out.println("Price after remove: " + mercado.calcularValorTotal());

        mercado.printCarrinho();
    }
}
