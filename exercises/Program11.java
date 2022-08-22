package exercises;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

/*
Faça um programa que receba um nome completo na forma de uma String e
mostre a abreviatura deste nome. Não se devem abreviar as palavras com 2 ou
menos letras. A abreviatura deve vir separada por pontos. Ex: Paulo Jose de
Almeida Prado. Abreviatura: P. J. de A. P.
*/

public class Program11 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);

        try {
            System.out.println("Enter your full name: ");
            String name = read.nextLine();
            String separate[] = name.split(" ");

            String middle = " ";
            for (String x : separate) {
                if (x.equals("do") || x.equals("da") || x.equals("de") || x.equals("dos")) {
                    middle = x;
                    System.out.print(x+ " ");
                } else {
                    System.out.print(x.toUpperCase().charAt(0)+ ". ");
                }



             }







        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        }
        read.close();
    }
}
