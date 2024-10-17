package challenges_stream_api;

import java.util.Arrays;
import java.util.List;

public class Ch003 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean numerosPositivos = numeros.stream().allMatch(numero -> numero > 0);

        if (numerosPositivos) {
            System.out.println("Todos os números da lista são positivos!");
        } else {
            System.out.println("Há numero(s) negativo(s) na lista!");
        }



    }
}
