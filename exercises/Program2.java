package exercises;

import java.util.Locale;
import java.util.Scanner;

/*
 Criar um programa que calcule a média de
 salários de uma empresa, pedindo ao usuário a
 grade de funcionários e os salários, e devolvendo
 a média salarial.

*/
public class Program2 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);

        System.out.println("Enter the number of employes: ");
        int x = read.nextInt();

        double totalSalary = 0.0;
        double mediaSalary = 0.0;
        for (int i = 0; i < x; i++) {
            System.out.println("Enter the #"+(i+1)+ " salary: ");
            double salary = read.nextDouble();
            totalSalary = totalSalary + salary;
        }
        System.out.println("Total salary: "+String.format("%.3f", totalSalary));
        System.out.println("Media salary: "+String.format("%.3f",totalSalary/x));
    }
}
