package stream;

import java.util.*;

/*  Consumer é uma operação que recebe um tipo genérico T e não possui retorno.
    É utilizada para realizar ações como a desse exemplo para teste, de verificação
    de altura mínima para utilização do brinquedo.
*/

public class ConsumerExample {
    public static void main(String[] args) {
        List<Double> numbers = Arrays.asList(1.63, 1.80, 1.86, 1.75);

        numbers.stream().forEach(n -> { 
            if(n >= 1.7) 
                System.out.println("Altura suficiente para ir ao brinquedo: " + n);
        });  
    }
}