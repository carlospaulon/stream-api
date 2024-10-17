package challenges_stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Ch005 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        BinaryOperator<Integer> somar = Integer::sum;

        //resoluções mais tangiveis utilizam o método average ao final da stream
        List<Integer> numerosFiltrados = numeros.stream().filter(n -> n > 5).toList();

        int soma = numerosFiltrados.stream().reduce(0, somar);
        int media = soma / numerosFiltrados.size();

        System.out.println("A média dos números da lista maiores que 5 é: " + media);
    }
}
