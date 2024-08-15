package desafio5;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Desafio5 {
  public static void main(String[] args) throws Exception {
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    int soma = numeros.stream()
    .filter(n -> n>5)
    .reduce(0, Integer::sum);

    long contagem = numeros.stream()
    .filter(n -> n>5)
    .count();

    long resultado = soma/contagem;

    System.out.println(resultado);


  }
}
