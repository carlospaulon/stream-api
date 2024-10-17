package funcional_interfaces.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Ex004 {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("java", "kotlin", "python", "javascript", "c", "go", "ruby");

        Predicate<String> tamanhoPalavras = n -> n.length() > 5;

        List<String> palavrasCinco = palavras.stream().filter(tamanhoPalavras).collect(Collectors.toList());

        for (String palavra : palavrasCinco) {
            System.out.println(palavra);
        }
    }
}
