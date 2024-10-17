package challenges_stream_api;

import java.util.*;

public class Ch004 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosParesComNeutro = numeros.stream()
                .filter(numero -> numero % 2 == 0 || numero == 0)
                .sorted()
                .toList();

        System.out.println("Números Pares e neutro na lista: " + numerosParesComNeutro);


        /*

        Se eu quisesse utilizar o removeIf, eu precisaria alterar o meu tipo de lista
        para uma nova arrayList, passando como parâmetro a nossa lista atual.
        o Array.asList retorna uma lista com valor fixo (array).

        List<Integer> numerosPares = new ArrayList<>(numeros);
        numerosPares.removeIf(n -> n % 2 != 0);
        System.out.println(numerosPares);

        */

    }
}
