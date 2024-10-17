package challenges_stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Ch011 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Function<Integer, Integer> elevarAoQuadrado = numero -> numero * numero;
        int resultado = numeros.stream().map(elevarAoQuadrado).reduce(Integer::sum).orElse(null);
        System.out.println("A soma dos quadrados de todos os números da lista é: " + resultado);

    }
}
