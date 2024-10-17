package funcional_interfaces.supplier;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex003 {
    public static void main(String[] args) {
        List<String> saudacoes = Stream.generate(()->"Bom dia!")
                .limit(7)
                .collect(Collectors.toList());

        saudacoes.forEach(System.out::println);
    }
}
