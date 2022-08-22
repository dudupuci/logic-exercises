package exercises;

import java.util.*;
import java.util.stream.Collectors;

public class Program6 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Insira um texto qualquer ");
        String text = read.nextLine();
        String separate[] = text.split(" ");

        List<String> listText = new ArrayList<>();
        listText.addAll(Arrays.asList(separate));

        //escolher palavra pra ser trocada
        System.out.println("Escolha uma palavra do texto para ser trocada: ");
        String word = read.next();

        // validando se no array existe uma string igual "word"
        if (listText.contains(word)) {
            System.out.println("Quer trocar " + word + " por qual palavra?");
            String newWord = read.next();

            //pegando o indexOf da string = "word" no array
            listText.set(listText.indexOf(word), newWord);


        } else {
            System.out.println("NÃO CONTEM A PALAVRA : " + word);
        }

        for (String x : listText) {
            System.out.println(" NOVA LISTA: " + x);

        }

    }

}
