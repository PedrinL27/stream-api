package desafio4;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Desafio4 {
  public static void main(String[] args) throws Exception {
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    Predicate<Integer> numerosPares = n -> (n%2) == 0;

    List<Integer> numerosFiltrados = numeros.stream()
    .filter(numerosPares)
    .collect(Collectors.toList());

    numerosFiltrados.forEach(System.out::println);

  }
}
