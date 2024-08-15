package desafio10;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio10 {
  public static void main(String[] args) throws Exception {
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    List<Integer> multiplos = numeros.stream()
    .filter(n -> n % 3 == 0 || n % 5 == 0)
    .collect(Collectors.toList());

    multiplos.stream()
    .forEach(System.out::println);
  }
}
