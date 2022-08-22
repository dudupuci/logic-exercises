package exercises;

import java.util.Locale;
import java.util.Scanner;

/*
Fazer um programa que receba uma string do usuário e mostre o conteúdo desta
string de forma invertida.
 */

public class Program12 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);
        try {
            System.out.println("Enter a string: ");
            String text = read.next();

            for (int i = text.length(); i != 0; i--) {
                System.out.print(text.charAt(i-1));

            }


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

            read.close();
        }
    }

