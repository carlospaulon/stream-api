package optional;

import java.util.Optional;

public class ExamplesOptional {
    public static void main(String[] args) {
        //Criando um Optional e exibindo seu valor (get) - Se for nulo lança um NPE
        Optional<String> optionalValue1 = Optional.of("Hello World!");
        System.out.println(optionalValue1.get());

        //criando um Optional que aceita null
        String nullableValue = null;
        Optional<String> optionalValue2 = Optional.ofNullable(nullableValue);
        System.out.println(optionalValue2.isPresent());

        //Optional vazio
        Optional<String> optionalValue3 = Optional.empty();
        System.out.println(optionalValue3.isPresent());

        //verificando se o Optional possui valor
        Optional<String> optionalValue4 = Optional.of("Hello World!");
        System.out.println(optionalValue4.isPresent());

        //verificando se o Optional está vazio
        Optional<String> optionalValue5 = Optional.ofNullable(null);
        System.out.println(optionalValue5.isEmpty());

        //pego o valor do Optional, senão retorno um valor padrão se o mesmo estiver vazio (posso retornar null)
        Optional<String> optionalValue6 = Optional.ofNullable(null);
        String result1 = optionalValue6.orElse("Default");
        System.out.println(result1);

        //pego o valor do Optional, senão retorno um Supplier se o mesmo estiver vazio
        Optional<String> optionalValue7 = Optional.ofNullable(null);
        String result2 = optionalValue7.orElseGet(() -> "Valor pelo Supplier");
        System.out.println(result2);

        //pego o valor do Optional, senão lanço uma exceção pelo Supplier se o Optional estiver vazio
        Optional<String> optionalValue8 = Optional.ofNullable("Valor Optional 8");
        String result3 = optionalValue8.orElseThrow(() -> new RuntimeException("Valor não presente!"));
        System.out.println(result3);

        //se o Optional ter valor, eu executo uma ação de um Consymer
        Optional<String> optionalValue9 = Optional.of("Hello World!");
        optionalValue9.ifPresent(value -> System.out.println("Valor presente Optional 9: " + value));
    }
}
