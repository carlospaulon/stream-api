package challenges_stream_api;

import java.util.Arrays;
import java.util.List;

public class Ch015 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Boolean numNegatives = numeros.stream().anyMatch(n -> n < 0);
        String negativoNaLista = (!numNegatives) ? "Não há nenhuma número negativo na lista!" : "Há algum número negativo na lista!";

        System.out.println(negativoNaLista);



    }
}
