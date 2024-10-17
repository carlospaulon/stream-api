package funcional_interfaces.predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Ex006 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Predicate<Integer> isPar = new Predicate<Integer>() {
            @Override
            public boolean test(Integer numero) {
                return numero % 2 == 0;
            }
        };

        List<Integer> numerosPares = new ArrayList<>();

        for (int numero : numeros) {
            if (isPar.test(numero)) {
                numerosPares.add(numero);
            }
        }

        for (int numero : numerosPares) {
            System.out.println(numero);
        }

        System.out.println("\nImprimindo com Methdo Reference");
        numerosPares.forEach(System.out::println);
    }
}
