package desafio9;
import java.util.Arrays;
import java.util.List;

public class Desafio9 {

  public static void main(String[] args) throws Exception {
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    boolean distintos = numeros.stream()
    .distinct()
    .count() == numeros.size();

    if (distintos) {
        System.out.println("Todos os números são distintos.");
        } else {
        System.out.println("Existem números repetidos na lista.");
    }
  }
}
