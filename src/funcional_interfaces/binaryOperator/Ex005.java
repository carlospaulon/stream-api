package funcional_interfaces.binaryOperator;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Ex005 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);

        BinaryOperator<Integer> somar = Integer::sum;

        int resultado = numeros.stream().reduce(0, somar);

        System.out.println(resultado);
    }
}
