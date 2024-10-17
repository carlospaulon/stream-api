package funcional_interfaces.supplier;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex001 {
    public static void main(String[] args) {
        Supplier<String> saudacao = () -> "Bom dia! Tudo Bem?";

        List<String> listaSaudacoes = Stream.generate(saudacao)
                .limit(5).collect(Collectors.toList()); //podia utilizar apenas o toList()

        listaSaudacoes.forEach(System.out::println);
    }
}
