package funcional_interfaces.binaryOperator;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Ex001 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        BinaryOperator<Integer> somaLista = (n1, n2) -> n1 + n2;

        int resultado = numeros.stream().reduce(0, somaLista);

        System.out.println(resultado);
    }
}
