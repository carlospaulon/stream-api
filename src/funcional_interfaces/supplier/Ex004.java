package funcional_interfaces.supplier;

import java.util.List;
import java.util.stream.Stream;

public class Ex004 {
    public static void main(String[] args) {
        List<String> saudacoes = Stream.generate(
                () -> {
                    return "Boa noite!";
                }
        ).limit(2).toList();

        saudacoes.forEach(System.out::println);
    }
}
