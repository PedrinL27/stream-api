package desafio2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;


public class Desafio2 {

  public static void main(String[] args) throws Exception {
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    Predicate<Integer> numerosPares = n -> (n%2) == 0;

    int resultado = numeros.stream()
    .filter(numerosPares)
    .reduce(0, Integer::sum);

    System.out.println(resultado);
  }
}
