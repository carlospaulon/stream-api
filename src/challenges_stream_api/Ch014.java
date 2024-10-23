package challenges_stream_api;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Ch014 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        //Analisar a lógica para encontrar números primos
        Integer numeroPrimos = numeros.stream().filter(n -> {
            if (n < 2) {
                return false;
            }
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }).max(Comparator.naturalOrder()).orElse(null);


        System.out.println("O maior número primo da lista é: " + numeroPrimos);


    }
}
