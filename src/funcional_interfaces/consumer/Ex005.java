package funcional_interfaces.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Ex005 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        numeros.stream().filter(new Predicate<Integer>() {
            @Override
            public boolean test(Integer n) {
                return n % 2 == 0;
            }
        }).forEach(System.out::println);
    }
}
