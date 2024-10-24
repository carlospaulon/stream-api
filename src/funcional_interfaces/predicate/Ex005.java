package funcional_interfaces.predicate;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Ex005 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Predicate<Integer> isPar = n -> n % 2 == 0;

        List<Integer> numerosPares = numeros.stream().filter(isPar).toList();

        numerosPares.forEach(System.out::println);
    }
}
