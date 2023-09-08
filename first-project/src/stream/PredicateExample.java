package stream;

import java.util.*;
import java.util.function.Predicate;

/*  Representa uma função que recebe um argumento do tipo T e retorna um boolean (V ou F)
    Normalmente é usado pra filtrar os elementos do Stream.
*/

public class PredicateExample {
    public static void main(String[] args) {
        List <Integer> ages = Arrays.asList(16, 15, 18, 22, 23, 11, 72, 54);

        ages.stream().filter(new Predicate<Integer>() {
            @Override
            public boolean test(Integer t) { return t >= 18; } //maior de idade
        }).forEach(t -> System.out.println("Pode passar o que tem " + t + " anos"));
    }
}