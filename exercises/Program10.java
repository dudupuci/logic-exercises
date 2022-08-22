package exercises;

import java.util.Locale;
import java.util.Scanner;

public class Program10 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);

// Conta e informa quantas vezes a segunda string ocorre dentro da primeira
        try {
            System.out.println("Enter two strings: ");
            String text1 = read.next();
            String text2 = read.next();

            int index = 0;
            int count = 0;

            while (index != -1) {
                index = text1.indexOf(text2, index);

                if (index != -1) {
                    count++;
                    index = index + text2.length();
                }
            }
            System.out.println(count);


        } catch (Exception e) {
            System.out.println("Error captured: "+e.getMessage());
        }

        read.close();
    }
}
