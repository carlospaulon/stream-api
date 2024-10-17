package funcional_interfaces.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Ex004 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        numeros.stream().forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer numero) {
                if (numero % 2 == 0) {
                    System.out.println(numero);
                }
            }
        });
    }

}
