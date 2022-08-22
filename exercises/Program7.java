package exercises;

import java.util.Locale;
import java.util.Scanner;

public class Program7 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);

        System.out.println("Enter a minimum salary: ");
        double minSalary = read.nextDouble();

        System.out.println("Enter your salary: ");
        double mySalary = read.nextDouble();

        calculate(minSalary, mySalary);


    }

    public static void calculate(Double minSalary, Double salary) {
        double difference = salary - minSalary;
        if (minSalary == 0 | minSalary < 0) {
            System.out.println("O salário minimo não pode ser nulo ou menor que zero.");
        } else if (Math.round(minSalary) * 2 == Math.round(salary)) {
            System.out.println("Você ganha 2 salários minimos");
        } else if (Math.round(minSalary) * 3 == Math.round(salary)) {
            System.out.println("Você ganha 3 salários minimos");

        } else if (Math.round(minSalary) * 4 == Math.round(salary)) {
            System.out.println("Você ganha 4 salários minimos");
        } else if (Math.round(minSalary) * 5 == Math.round(salary)) {
            System.out.println("Você ganha 5 salários minimos");
        } else {
            System.out.println("Você 6 ou mais salários minimos");
        }


    }


}
