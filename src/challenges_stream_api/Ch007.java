package challenges_stream_api;

import java.util.*;

public class Ch007 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);


        int maiorNumero = numeros.stream()
                .max(Integer::compareTo) //utilizando um comparator method reference
                .orElseThrow(() -> new NoSuchElementException("Nao foi possível encontrar o elemento!"));

        int segundoMaiorNumero = numeros.stream()
                .filter(n -> n < maiorNumero)
                .max(Comparator.naturalOrder()) //utilizando o método da classe Comparator, naturalOrder
                .orElseThrow(() -> new RuntimeException("Nao foi possível encontrar o elemento!"));

        System.out.println("O segundo maior número da lista é: " + segundoMaiorNumero);
        
    }
}
