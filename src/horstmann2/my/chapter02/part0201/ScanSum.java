package horstmann2.my.chapter02.part0201;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class ScanSum {
    public static void main(String[] args) {

        double sum = 0;

        try (Scanner s = new Scanner(new BufferedReader(new FileReader("usnumbers.txt")))){
            s.useLocale(Locale.forLanguageTag("RU"));

            while (s.hasNext()) {
                if (s.hasNextDouble()) {
                    sum += s.nextDouble();
                } else {
                    s.next();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(sum);
    }
}
