package collections.set.pesquisa;

public class Contato {
    private String name;
    private int telephoneNumber;

    public Contato(String name, int number) {
        this.name = name;
        this.telephoneNumber = number;
    }

    //getters
    public int getPhoneNumber() { return this.telephoneNumber; }
    public String getName() { return this.name; }
    public void setPhoneNumber(int number) { //Setter
        this.telephoneNumber = number;
    }

    @Override
    public String toString() {
        return "{" + this.name + " | " + this.telephoneNumber + "}";
    }

    @Override   
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this == obj) return true;
        if (!(obj instanceof Contato)) return false;
        Contato other = (Contato) obj;
        return this.name.equals(other.getName());
    }

    @Override
    public int hashCode() {
        return this.name.hashCode();
    }

    
}
