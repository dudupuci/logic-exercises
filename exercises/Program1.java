package exercises;

import java.util.*;

public class Program1 {
   /* 2. Tem-se um conjunto de dados contendo a altura e o sexo (masculino, feminino) de 10 pessoas.
    Fazer um algoritmo que calcule e escreva:
    a. a maior e a menor altura do grupo;
    b. média de altura dos homens;
    c. o número de mulheres.*/

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);


        int qntM = 0;
        int qntH = 0;
        double heightM = 0.0;
        double heightH = 0.0;
        double sumHeightM = 0.0;
        double sumHeightH = 0.0;
        List<Double> heights = new ArrayList<>();


        for (int i = 0; i < 10; i++) {
            System.out.println("Enter person sex (M/H): ");
            char sex = read.next().charAt(0);
            System.out.println("Enter person height: ");
            double height = read.nextDouble();

            // sex verification
            if (sex == 'H' || sex == 'h') {
                qntH = qntH + 1;
                heightH = height;
                sumHeightH = sumHeightH + heightH;
                heights.add(heightH);

            } else if (sex == 'M' || sex == 'm') {
                qntM = qntM + 1;
                heightM = height;
                sumHeightM = sumHeightM + heightM;
                heights.add(heightM);
            }


        }
        System.out.println("Mens: "+qntH);
        System.out.println("Womans: "+qntM);
        System.out.println("Media mens: "+(sumHeightH/qntH));
        double max = Collections.max(heights);
        double min = Collections.min(heights);

        System.out.println("Max height: "+max+ ", \nMin height: "+min);
    }
}
