package collections.list.ordenacao;

public class Pessoa implements Comparable<Pessoa> {
    private String name;
    private int age;
    private double heigth;

    public Pessoa(String name, int age, double heigth) {
        this.name = name;
        this.age = age;
        this.heigth = heigth;
    }

        //getters
    public String getName() {     return name;      }
    public int getAge() {         return age;       }
    public double getHeigth() {   return heigth;    }

    @Override
    public int compareTo(Pessoa p) {
        return Integer.compare(this.age, p.getAge());
    }
    @Override
    public String toString() {
        return "Pessoa {nome=" + name + ", idade=" + age + ", altura=" + heigth + "}";
    }
}