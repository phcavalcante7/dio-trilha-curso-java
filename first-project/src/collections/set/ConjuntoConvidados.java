package collections.set;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidados;

    public ConjuntoConvidados() { //constructor
        this.convidados = new HashSet<>();
    }

    public void addConvidado(String name, int id) {
        Convidado convidado = new Convidado(name, id);
        this.convidados.add(convidado);
    }

    public void removerConvidado(int id) {
        for (Convidado convidado : convidados) {
            if (convidado.getInviteId() == id) {
                this.convidados.remove(convidado);
                break;
            }
        }
    }
    
    public int contarConvidados() { return convidados.size(); }

    public void printConvidados() {
        for (Convidado convidado : convidados) {
            System.out.println(convidado);
        }
    }

    public static void main(String[] args) {
        ConjuntoConvidados c = new ConjuntoConvidados();

        c.addConvidado("Convidado 1", 1);
        c.addConvidado("Convidado 2", 2);
        c.addConvidado("Convidado 3", 2);    
        c.addConvidado("Convidado 4", 4);

        System.out.println(c.contarConvidados());   //3 (guest 2 and 3 has the same ID)

        c.removerConvidado(2);  //3 - 1 = 2
        c.removerConvidado(1);  //1 - 1 = 1
    
        c.printConvidados();    //output guest 4
    }
}
