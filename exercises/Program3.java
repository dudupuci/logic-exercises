package exercises;

/*

Uma parede em formato retangular, cuja altura é hp (altura da parede) e a largura lp (largura da parede) precisa
ser coberta por azulejos também retangulares. O azulejo retangular tem dimensões ha (altura do azulejo) e la (largura do azulejo).
Escreva um programa que leia as quatro medidas hp, lp, ha e la,
calcule e imprima quanto azulejos com as medidas dadas são necessários
para cobrir a parede dada


 */

import java.util.Locale;
import java.util.Scanner;

public class Program3 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);


        System.out.println("Altura parede ");
        double alturaParede = read.nextDouble();
        System.out.println("Largura parede: ");
        double larguraParede = read.nextDouble();
        System.out.println("Altura azulejo: ");
        double alturaAzulejo = read.nextDouble();
        System.out.println("Largura azulejo: ");
        double larguraAzulejo = read.nextDouble();

       double qntd = (alturaParede * larguraParede / alturaAzulejo * larguraAzulejo);
       System.out.println("Quantidade de azulejos: "+String.valueOf(String.format("%.2f",qntd)));
    }



}
