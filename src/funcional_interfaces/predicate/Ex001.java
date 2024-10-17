package funcional_interfaces.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Ex001 {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("java", "kotlin", "python", "javascript", "c", "go", "ruby");

        Predicate<String> tamanhoPalavras = palavra -> palavra.length() > 5;

        palavras.stream().filter(tamanhoPalavras).forEach(System.out::println);
    }
}
