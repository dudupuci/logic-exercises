package exercises;

import javax.xml.transform.stream.StreamSource;
import java.sql.SQLOutput;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class Program9 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);

        ArrayList<String> keys = new ArrayList<>();
        List<String> generated = new ArrayList<>();
        keys.addAll(Arrays.asList("abc321def", "ghi654jkl", "mno987pqr", "stuvwxyz", "ke834uvb", "mmnd90c4", "AaBb9910kd", "3104mkdir"));
        try {
            System.out.println("Generating a string... wait!");
            Thread.sleep(3000);
            String element = null;
            int value = 0;

            for (int i = 0; i < 1; i++) {
                Random random = new Random();
                value = random.nextInt(keys.size());
                element = keys.get(value);
                generated.add(element);
            }
            System.out.println("Enter fast the sequence: "+generated);

            System.out.println("\nPode digitar!");
            // start count
            long start = System.nanoTime();

            String sequence = read.next();
            String phrase = generated.stream().filter(x -> x.equals(sequence)).collect(Collectors.joining());

            // verifica se a string informada é igual a gerada
            if (sequence.equals(phrase)) {
                System.out.println("acertou");
            } else {
                System.out.println("errou");
            }
            // end count
            long end = System.nanoTime();

            // calculate time
            long totalTime = end - start;

            // convert nanoseconds for seconds
            long convert = TimeUnit.SECONDS.convert(totalTime, TimeUnit.NANOSECONDS);
            String message = null;
            if (convert <= 4 && sequence.equals(phrase)) {
                message = "Congratulations, NICE TIME!";
            } else if (convert >= 5 && convert <= 7 && sequence.equals(phrase)) {
                message = "Not bad, bro! Keep trying...";
            } else {
                message = "Bad... so bad :(. Keep training and dont stop.";
            }

            System.out.println("Total time to input the generated key: "+convert+ " seconds.");
            System.out.println("----- F E E D B A C K -----");
            System.out.println(message);



        } catch (Exception e) {
            System.out.println(("Error captured : " + e.getMessage()));
        }
    }
}
