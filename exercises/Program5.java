package exercises;

import java.util.*;

public class Program5 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int[] array = new int[10];
        int num = 0;

        for (int i = 0; i < array.length; i++) {
            System.out.println("Insira um numero: ");
            array[i] = read.nextInt();

        }
        for (int x : array) {
            System.out.print(" "+ x);
        }
      


    }

}
