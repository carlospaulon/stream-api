package funcional_interfaces.consumer;

import java.util.Arrays;
import java.util.List;

public class Ex001 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);


        //entender porque as outras maneiras não funcionaram
        numeros.stream().forEach(n -> {
            if (n % 2 == 0) {
                System.out.println(n);
            }
        });
    }
}
