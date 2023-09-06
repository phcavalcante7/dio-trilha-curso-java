package collections.set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaDeContatos {
    private Set<Contato> agenda;

    public AgendaDeContatos() { //constructor
        this.agenda = new HashSet<>();
    }

    public void addContact(String name, int number) {
        this.agenda.add(new Contato(name, number));
    }

    public void exibirContatos() {
        for (Contato contato : this.agenda) {
            System.out.println(contato);
        }
    }

    public Set<Contato> searchByName(String name) {
        Set<Contato> found = new HashSet<>();
        for (Contato contato : this.agenda) {
            if (contato.getName().startsWith(name)) {
                found.add(contato);
            }
        }
        return found;
    }

    public void atualizarNumero(String contact, int newNumber) {
        for (Contato contato : this.agenda) {
            if (contato.getName().equalsIgnoreCase(contact)) {
                contato.setPhoneNumber(newNumber);
            }
        }
    }

    public static void main(String[] args) {
        AgendaDeContatos adc = new AgendaDeContatos();

        adc.addContact("João", 123456789);
        adc.addContact("Maria", 987654321);
        adc.addContact("João Gabriel", 987654321);
        adc.addContact("João", 123456789);
        adc.addContact("João da Silva", 454545454);

        adc.exibirContatos();

        adc.atualizarNumero("João da Silva", 1);

        System.out.println(adc.searchByName("João"));
    }
}
