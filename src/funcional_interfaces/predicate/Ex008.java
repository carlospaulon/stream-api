package funcional_interfaces.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Ex008 {
    public static void main(String[] args) {
        //instanciando o parâmetro do filter com int
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        numeros.stream().filter(new Predicate<Integer>() {
            @Override
            public boolean test(Integer n) {
                return n % 2 == 0;
            }
        }).forEach(System.out::println);
    }
}
