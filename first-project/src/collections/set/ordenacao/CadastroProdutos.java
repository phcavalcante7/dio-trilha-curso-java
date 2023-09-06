package collections.set.ordenacao;

import java.util.*;

public class CadastroProdutos {
    Set<Produto> produtos;

    public CadastroProdutos() {
        this.produtos = new HashSet<>();
    }

    public void addProduto(String name, int id, double price, int amount) {
        produtos.add(new Produto(name, id));
        for(Produto p : produtos) {
            if(p.getId() == id) {
                p.setPrice(price);
                p.setAmount(amount);
            }
        }
    }

    public Set<Produto> printByName() {
        Set<Produto> produtosOrdenados = new TreeSet<>(produtos);
        return produtosOrdenados;
    }

    public Set<Produto> printByPrice() {
        Set<Produto> produtosOrdenados = new TreeSet<>(new Comparator<Produto>() {
            @Override
            public int compare(Produto p1, Produto p2) {
                if(p1.getPrice() > p2.getPrice()) return 1;
                if(p1.getPrice() < p2.getPrice()) return -1;
                return 0;
            }
        });
        produtosOrdenados.addAll(produtos);
        return produtosOrdenados;
    }

    public static void main(String[] args) {
        CadastroProdutos cp = new CadastroProdutos();
        cp.addProduto("Arroz", 1, 10.0, 5);
        cp.addProduto("Feijão", 2, 5.0, 10);
        cp.addProduto("Macarrão", 3, 3.0, 15);
        cp.addProduto("Carne", 4, 20.0, 2);
        cp.addProduto("Frango", 5, 15.0, 3);

        System.out.println("Produtos ordenados por nome:");
        for(Produto p : cp.printByName()) {
            System.out.println(p);
        }

        System.out.println("\nProdutos ordenados por preço:");
        for(Produto p : cp.printByPrice()) {
            System.out.println(p);
        }
    }
}
