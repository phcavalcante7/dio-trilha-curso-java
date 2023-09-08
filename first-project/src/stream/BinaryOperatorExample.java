package stream;

import java.util.*;

/*  É um procedimento que recebe dois argumentos de um tipo T e retorna um objeto
    do mesmo tipo T. É usado para reduzir ou combinar elementos 
*/

public class BinaryOperatorExample {
    public static void main(String[] args) {
        List <Integer> numbers = Arrays.asList(5, 23, 2, 1, 7); 

        //Somando os valores da lista de números
        int result = numbers.stream().reduce(0, (num1, num2) -> num1 + num2); //usando binOperator como lambda

        System.out.println(result);
    }
}