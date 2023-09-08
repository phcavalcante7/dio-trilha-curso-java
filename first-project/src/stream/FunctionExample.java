package stream;

import java.util.*;

/*  Representa uma função que aceita um argumento do tipo T e retorna algum outro
    tipo genérico R. É utilizada para transformar ou mapear em novos valores os valores
    dos elementos do Stream.
*/

public class FunctionExample {
    public static void main(String[] args) {
        List <Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6); //lista generica de 1 a 6

        List<Double> listPi = list.stream().map(n -> n * Math.PI).toList(); //multiplicando a lista por PI

        listPi.forEach(n -> System.out.printf("%.2f\n", n)); //output com 2 numeros apos a virgula
        
    }
}
