package challenges_stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Ch006 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Predicate<Integer> verificarNumero = numero -> numero > 10;

        //verificando se há ou não e mostrando os elementos que atendem a condição
        List<Integer> numeroMaior = numeros.stream().filter(verificarNumero).sorted().toList();

        if (!numeroMaior.isEmpty()) {
            System.out.println("Número(s) maior(es) que 10: " + numeroMaior);
        } else {
            System.out.println("Não nenhum número na lista maior que 10!");
        }

        //verificando apenas se há ou não
        boolean maiorQueDez = numeros.stream().anyMatch(verificarNumero);
        if (maiorQueDez) {
            System.out.println("Há algum número maior que 10!");
        } else {
            System.out.println("Não nenhum número na lista maior que 10!");
        }
    }
}
