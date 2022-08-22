package exercises;

import java.util.*;
import java.util.stream.Collectors;

public class Program8 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);

        Random random = new Random();
        List<String> setGeneratedKeyValues = new ArrayList<>();
        setGeneratedKeyValues.addAll(Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v"
                , "w", "x", "y", "z", "1", "2", "3", "4", "5", "6", "7", "8", "9", "!", "@", "#", "$", "%", "&", "*", "-"));

        Set<String> generated = new HashSet<>();

        int value = 0;
        String element = null;
        for (int i = 0; i < 8; i++) {
            // int value percorre e captura as POSICOES dos elementos na lista setGeneratedKeyValues
            value = random.nextInt(setGeneratedKeyValues.size());
            // String element recebe o valor da variavel na posicao capturada pelo VALUE
            element = setGeneratedKeyValues.get(value);
            // adiciona o elemento na respectiva posição.

            generated.add(element);
        }
        generated.forEach(System.out::print);
    }

}
