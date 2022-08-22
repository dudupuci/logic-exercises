package exercises;

/*
Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e
mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30.
(Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)

*/

import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Enter your age in years, months and days.  ");
        Integer years = read.nextInt();
        Integer months = read.nextInt();
        Integer days = read.nextInt();

        Integer totalDays = (years * 365) + (months * 30) + days;
        System.out.println("Total days of your life: "+totalDays);

    }

}
