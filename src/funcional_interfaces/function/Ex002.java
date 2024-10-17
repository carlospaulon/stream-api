package funcional_interfaces.function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Ex002 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);

        List<Integer> numerosDobrados = numeros.stream()
                .map(
            new Function<Integer, Integer>() {
                @Override
                public Integer apply(Integer num) {
                    return num * 2;
                }
        })
            .toList();

        numerosDobrados.forEach(System.out::println);
    }
}
