package challenges_stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Ch019 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        //elementos únicos
        Set<Integer> numerosDiviseis = numeros.stream().filter(n -> n % 3 == 0 || n % 5 == 0).collect(Collectors.toSet());
        int resultado = numerosDiviseis.stream().reduce(0, (n1, n2) -> n1 + n2);
        System.out.println("Set\nOs números da lista, divisíveis por três e por cinco são: " + numerosDiviseis);
        System.out.println("A soma dos números divisíveis três e cinco é: " + resultado);

        //elementos duplicados
        List<Integer> numerosDiviseis1 = numeros.stream().filter(n -> n % 3 == 0 || n % 5 == 0).toList();
        int resultado1 = numerosDiviseis1.stream().reduce(0, Integer::sum);
        System.out.println("\nList\nOs números da lista, divisíveis por três e por cinco são: " + numerosDiviseis1);
        System.out.println("A soma dos números divisíveis três e cinco é: " + resultado1);

    }
}

