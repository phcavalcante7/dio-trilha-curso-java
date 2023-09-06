package collections.list;

public class Livro {
    private String title;
    private String autor;
    private int year;

    public Livro(String title, String autor, int year) { //constructor
        this.title = title;
        this.autor = autor;
        this.year = year;
    }

        //getters
    public String getTitle() { return this.title; }
    public String getAutor() { return this.autor; }
    public int getYear() { return this.year; }

    @Override
    public String toString() {
        return "Livro{" +
                "title='" + title + '\'' +
                ", autor='" + autor + '\'' +
                ", year=" + year +
                '}';
    }
}
