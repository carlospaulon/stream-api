package challenges_stream_api;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ch009 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Set<Integer> setNumeros = new HashSet<>();
        List<Integer> numerosRepetidos = numeros.stream().filter(n -> !setNumeros.add(n)).toList();

        if (!numerosRepetidos.isEmpty()) {
            System.out.println("Os elementos da lista não são todos distintos");
            System.out.println("Número(s) repetido(s) da lista: " + numerosRepetidos);
        } else {
            System.out.println("Os elementos da lista são distintos");
            System.out.println(setNumeros);
        }

        //mostrando a lista distinta
        System.out.println("\nLista com elementos distintos:");
        numeros.stream().distinct().forEach(System.out::println);
    }
}
