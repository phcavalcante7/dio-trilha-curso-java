package collections.set;

public class Convidado {
    private String name;
    private int inviteId;

    public Convidado(String name, int inviteId) { //constructor
        this.name = name;
        this.inviteId = inviteId;
    }

    //getters
    public String getName() {return name;}
    public int getInviteId() {return inviteId;}

    @Override
    public String toString() {
        return "Convidado {Nome=" + name + ", Código=" + inviteId + "}";
    }
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Convidado) {
            Convidado convidado = (Convidado) obj;
            return this.inviteId == convidado.inviteId; 
        }
        return false;
    }
    @Override
    public int hashCode() {
        return this.inviteId;
    }
}
