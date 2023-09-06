package collections.map.ordenacao;

public class Evento {
    private String name;
    private String show;

    public Evento(String name, String show) {
        this.name = name;
        this.show = show;
    }

    //getters
    public String getNome() { return this.name; }
    public String getShow() { return this.show; }

    @Override
    public String toString() {
        return "(" + name + ", " + show + ")";
    }
}
