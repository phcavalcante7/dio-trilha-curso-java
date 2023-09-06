package collections.set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> words;

    public ConjuntoPalavrasUnicas() { //constructor
        this.words = new HashSet<>();
    }

    void addWord(String word) {
        this.words.add(word);
    }

    void removeWord(String word) {
        this.words.remove(word);
    }

    boolean verifierWord(String word) {
        for(String w : words) {
            if(w.equalsIgnoreCase(word)) {
                return true;
            }
        }
        return false;
    }

    void printWords() {
        for(String w : words) {
            System.out.println(w);
        }
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas cpu = new ConjuntoPalavrasUnicas();

        cpu.addWord("Salame");
        cpu.addWord("Cotonete");
        cpu.addWord("Abacaxi");
        cpu.addWord("Salame"); //this isnt add

        System.out.println(cpu.verifierWord("abacaxi")); //TRUE
        
        cpu.removeWord("Abacaxi");

        System.out.println(cpu.verifierWord("abacaxi")); //FALSE

        cpu.printWords();
    }
}