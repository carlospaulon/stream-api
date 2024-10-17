package funcional_interfaces.supplier;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class Ex005 {
    public static void main(String[] args) {
        Supplier<String> saudacao = new Supplier<String>() {
            @Override
            public String get() {
                return "Boa noite";
            }
        };

        List<String> listaSaudacoes = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            listaSaudacoes.add(saudacao.get());
        }

        for (String saudacaoGerada : listaSaudacoes) {
            System.out.println(saudacaoGerada);
        }
    }
}
