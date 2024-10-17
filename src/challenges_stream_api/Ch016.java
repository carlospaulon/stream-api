package challenges_stream_api;

import java.util.Arrays;
import java.util.List;

public class Ch016 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosPares = numeros.stream().filter(n -> n % 2 == 0).sorted().toList();
        List<Integer> numerosImpares = numeros.stream().filter(n -> n % 2 != 0).sorted().toList();

        System.out.println("Números Pares:");
        numerosPares.stream().forEach(numeroPar -> System.out.print(numeroPar + " "));

        System.out.println();
        System.out.println("\nNúmeros Impares:");
        numerosImpares.stream().forEach(numeroImpar -> System.out.print(numeroImpar + " "));
    }
}
