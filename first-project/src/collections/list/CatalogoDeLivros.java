package collections.list;

import java.util.ArrayList;
import java.util.List;

public class CatalogoDeLivros {
    List<Livro> list;

    public CatalogoDeLivros() { //constructor
        this.list = new ArrayList<>();
    }

    public void addLivro(Livro livro) {
        this.list.add(livro);
    }

    public void buscaPorAutor(String autor) {
        for (Livro livro : this.list) {
            if(livro.getAutor().equals(autor)) {
                System.out.println(livro);
            }
        }
    }

    public void buscaPorIntervaloAnos(int anoInicio, int anoFim) {
        for (Livro livro : this.list) {
            if(livro.getYear() >= anoInicio && livro.getYear() <= anoFim) {
                System.out.println(livro);
            }
        }
    }

    public void buscaPorTitulo(String titulo) {
        for (Livro livro : this.list) {
            if(livro.getTitle().equalsIgnoreCase(titulo)) {
                System.out.println(livro);
            }
        }
    }

    public static void main(String[] args) {
        CatalogoDeLivros cdl = new CatalogoDeLivros();

        cdl.addLivro(new Livro("O Senhor dos Anéis", "J. R. R. Tolkien", 1954));
        cdl.addLivro(new Livro("O Hobbit", "J. R. R. Tolkien", 1937));
        cdl.addLivro(new Livro("Percy Jackson e o Mar de Monstros", "seila", 2012));

        cdl.buscaPorAutor("seila");
        cdl.buscaPorIntervaloAnos(1935, 1958);
        cdl.buscaPorTitulo("percy jackson e o mar de monstros");
    }
}