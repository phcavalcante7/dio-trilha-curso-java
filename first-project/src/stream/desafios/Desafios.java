package stream.desafios;

import java.util.*;
import java.util.stream.Collectors;

public class Desafios {
    public static void main(String[] args) {
        List <Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 15, 14, 11, 12);

    //Desafio 1 : Mostre a lista de números na ordem númerica.
        System.out.println(numeros.stream().sorted().collect(Collectors.toList()));

    //Desafio 2 : Imprima a soma dos números pares da lista.
        System.out.println("Soma: " + numeros.stream().filter(n -> n % 2 == 0).reduce(0, (num1, num2) -> num1 + num2));

    //Desafio 3 : Verifique se todos os números da lista são positivos.
        if(numeros.stream().filter(n -> n < 0).toList().isEmpty()) //verificando se a lista com elementos menores que zero está vazia
            System.out.println("Todos os elementos são positivos!");

    //Desafio 4 : Remova todos os valores ímpares.
        List <Integer> numerosPares = numeros.stream().filter(n -> n % 2 == 0).toList();
        System.out.println(numerosPares);

    //Desafio 5 : Calcule a média dos valores maiores que cinco.
        System.out.println(numeros.stream().filter(n -> n > 5).reduce(0, (num1, num2) -> num1 + num2) / //valores maiores que 5
        numeros.stream().filter(n -> n > 5).count());   //dividido pela quantidade de elementos maiores que 5

    //Desafio 6 : Verificar se a lista contém um número maior que 10.   
        if(!numeros.stream().filter(n -> n > 10).toList().isEmpty()) //caso a lista com números maiores que 10 não esteja vazia
            System.out.println("Possui elemento maior que 10.");

    //Desafio 7 : Encontre o segundo maior elemento da lista.
        System.out.println(numeros.stream().sorted().toList().get(numeros.size() - 2)); //pegando o penúltimo item da lista ordenada
    
    //Desafio 8 : Somar os dígitos de todos os números da lista.
        System.out.println(numeros.stream().reduce(0, (n1, n2) -> n1 + n2));

    //Desafio 9 : Verifique se não possui números repetidos.
        if(numeros.stream().distinct().toList().size() == numeros.size()) //num arr distintos == num arr normal
            System.out.println("Não possui números repetidos");

    //Desafio 10 : Agrupe os múltiplos de 3 e de 5.
        List <Integer> multiplos3ou5 = numeros.stream().filter(n -> n % 3 == 0 || n % 5 == 0).toList();
        System.out.println(multiplos3ou5);

    //Desafio 11 : Encontre a soma dos quadrados de todos os números da lista.
        System.out.println("Soma dos quadrados: " + numeros.stream().map(n -> n * n).reduce(0, (num1, num2) -> num1 + num2));
        
    //Desafio 12 : Encontre o produto de todos os números da lista.
        System.out.println("Produto dos números: " + numeros.stream().reduce(1, (num1, num2) -> num1 * num2));
 
    //Desafio 13 : Filtrar números entre 3 e 9.
        System.out.println("Lista sem valores entre 3 e 9: " + numeros.stream().filter(n -> n < 3 || n > 9).toList()); 
    }
}
