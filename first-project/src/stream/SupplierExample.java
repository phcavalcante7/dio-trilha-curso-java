package stream;

import java.util.*;
import java.util.stream.Stream;

/*  Supplier é uma operação que não recebe argumentos e retorna algum 
    tipo genérico T. É utilizada para gerar valores ou obter novos 
    objetos desse genérico.
*/

public class SupplierExample { 
    public static void main(String[] args) {
        List <Integer> numbers = Stream.generate(() -> 5).limit(5).toList();  //Gerando 5 números 5 para a lista de números

        numbers.forEach(System.out::println);  //Imprimindo os números da lista usando method reference
    }
}
