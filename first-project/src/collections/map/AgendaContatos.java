package collections.map;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agenda;   //must be primitive

    public AgendaContatos() {
        this.agenda = new HashMap<>();
    }

    public void addContato(String nome, Integer phone) {
        agenda.put(nome, phone);
    }

    public void removerContato(String name) {
        if( !agenda.isEmpty() )
            agenda.remove(name);
    }

    public void printContatos() {
        System.out.println(agenda);
    }

    public Integer pesquisarPorNome(String name) {
        Integer retorno = null;
        if( !agenda.isEmpty() ) {
           retorno = agenda.get(name);
        }
        return retorno;
    }

    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();

        agenda.addContato("João", 123456789);
        agenda.addContato("Maria", 987654321);
        agenda.addContato("José", 456789123);
        
        agenda.printContatos();

        agenda.removerContato("José");

        agenda.printContatos();

        System.out.println("O número do João é " + agenda.pesquisarPorNome("João"));
    }
}