package funcional_interfaces.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Ex002 {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("java", "kotlin", "python", "javascript", "c", "go", "ruby");

        palavras.stream().filter(new Predicate<String>() {
            @Override
            public boolean test(String palavra) {
                return palavra.length() > 5;
            }
        }).forEach(System.out::println);


    }
}
