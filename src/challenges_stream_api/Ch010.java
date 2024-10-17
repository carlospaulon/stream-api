package challenges_stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Ch010 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Predicate<Integer> isImpar = numero -> numero % 2 != 0;

        List<Integer> multiplos = numeros.stream().filter(n -> n % 3 == 0 || n % 5 == 0).sorted().toList();
        multiplos.stream().filter(isImpar).forEach(System.out::println);


    }
}
