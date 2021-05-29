package horstmann.sources.chapter06.part0602lambda;

import javax.swing.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;

public class LambdaTest {
    public static void main(String[] args) {
        String[] planets = new String[] {"Mercury", "Venus", "Earth",
                                        "Mars", "Jupiter", "Saturn",
                                        "Uranus", "Neptune" };

        System.out.println(Arrays.toString(planets));

        System.out.println("Sorted in dictionary order:");
        Arrays.sort(planets);
        System.out.println(Arrays.toString(planets));

        System.out.println("Sorted bу length:");
        Comparator<String> comp = (first, second) -> first.length() - second.length();
        Arrays.sort(planets, comp);
        System.out.println(Arrays.toString(planets));

        Timer t = new Timer(1000, event -> System.out.println("The time is " + new Date()));
        t.start();

        JOptionPane.showMessageDialog(null, "Quit program!");
        System.exit(0);
    }
}
