package collections.list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoPessoas {
    private List<Pessoa> list;
    
    public OrdenacaoPessoas() {
        this.list = new ArrayList<>();
    }

    public void addPessoa(String name, int age, double heigth) {
        this.list.add(new Pessoa(name, age, heigth));
    }

    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> ordenado = new ArrayList<>();
        ordenado.addAll(this.list);
        Collections.sort(ordenado);
        return ordenado;
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> ordenado = new ArrayList<>();
        ordenado.addAll(this.list);
        Collections.sort(ordenado, new CompararPelaAltura());
        return ordenado;
    }

    public static void main(String[] args) {
        OrdenacaoPessoas pessoas = new OrdenacaoPessoas();

        pessoas.addPessoa("Pe1", 20, 1.80);
        pessoas.addPessoa("Pe2", 18, 1.62);
        pessoas.addPessoa("Pe3", 29, 1.86);
        pessoas.addPessoa("Pe4", 50, 1.65);

        System.out.println("Ordenado por idade: " + pessoas.ordenarPorIdade());
        System.out.println("\n");
        System.out.println("Ordenado pela altura: " + pessoas.ordenarPorAltura());
    }
}


class CompararPelaAltura implements Comparator<Pessoa> {

    @Override
    public int compare(Pessoa p1, Pessoa p2) {
        return Double.compare(p1.getHeigth(), p2.getHeigth());
    }
    
}
