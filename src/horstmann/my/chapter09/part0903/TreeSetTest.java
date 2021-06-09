package horstmann.my.chapter09.part0903;

import java.awt.*;
import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        var sorter = new TreeSet<String>();
        sorter.add("Bob");
        sorter.add("Amy");
        sorter.add("Carl");
        for (String s : sorter) {
            System.out.println(s);
        }

    }
}
