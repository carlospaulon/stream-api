package funcional_interfaces.supplier;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex002 {
    public static void main(String[] args) {
        List<String> saudacoes = Stream.generate(
                new Supplier<String>() {

                    @Override
                    public String get() {
                        return "Olá, Bom dia!";
                    }
                }
                )
                .limit(3)
                .collect(Collectors.toList());

        saudacoes.forEach(System.out::println);
    }
}
