package challenges_stream_api;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ch018 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Set<Integer> setNumeros = new HashSet<>();
        List<Integer> numerosRepetidos = numeros.stream()
                .filter(n -> !setNumeros.add(n))
                .toList();

        boolean todosIguais = numeros.stream()
                .distinct()
                .count() <= 1;

        if (todosIguais) {
            System.out.println("Todos os números são iguais");
            System.out.println(numeros);
        } else {
            System.out.println("Os números não são todos iguais");
            System.out.println("Números repetidos da lista:");
            numerosRepetidos.stream().forEach(System.out::println);
        }
    }
}