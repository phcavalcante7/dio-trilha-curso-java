package collections.map.pesquisa;

import java.util.Map;

public class EstoqueProdutos {
    private Map<Integer, Produto> estoque;

    public EstoqueProdutos() {
        estoque = new java.util.HashMap<>();
    }

    public void addProduto(int id, String name, int amount, double price) {
        Produto p = new Produto(name, price);
        p.setQuantidade(amount);
        estoque.put(id, p);
    }

    public void printarProdutos() {
        System.out.println(estoque);
    }

    public double calcularPrecoTotal() {
        double totalPrice = 0.0;

        if( !estoque.isEmpty() ) {
            for(Produto p : estoque.values()) {
                totalPrice += p.getPreco() * p.getQuantidade();
            }
        }

        return totalPrice;
    }

    public Produto obterProdutoMaisCaro() {
        Produto p = null;

        if( !estoque.isEmpty() ) {
            for(Produto pr : estoque.values()) {
                if( p == null ) {
                    p = pr;
                } else if( pr.getPreco() > p.getPreco() ) {
                    p = pr;
                }
            }
        }

        return p;
    }

    public Produto obterProdutoMaisBarato() {
        Produto p = null;

        if( !estoque.isEmpty() ) {
            for(Produto pr : estoque.values()) {
                if( p == null ) {
                    p = pr;
                } else if( pr.getPreco() < p.getPreco() ) {
                    p = pr;
                }
            }
        }

        return p;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();

        estoque.addProduto(1, "Arroz", 10, 5.0);
        estoque.addProduto(2, "Feijão", 5, 3.0);
        estoque.addProduto(3, "Macarrão", 7, 2.0);
        estoque.addProduto(4, "Carne", 2, 20.0);
        estoque.addProduto(5, "Frango", 3, 15.0);

        estoque.printarProdutos();

        System.out.println("Produto mais barato: " + estoque.obterProdutoMaisBarato());
        System.out.println("Produto mais caro: " + estoque.obterProdutoMaisCaro());

        System.out.println("Preço total: " + estoque.calcularPrecoTotal() + " R$");
    }
}

