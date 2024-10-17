package funcional_interfaces.binaryOperator;

import java.util.Arrays;
import java.util.List;

public class Ex004 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);

        int resultado = numeros.stream().reduce(0, Integer::sum);

        System.out.println(resultado);
    }
}
