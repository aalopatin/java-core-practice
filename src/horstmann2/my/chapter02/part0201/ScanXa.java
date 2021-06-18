package horstmann2.my.chapter02.part0201;

import java.io.*;
import java.util.Scanner;

public class ScanXa {
    public static void main(String[] args) {

        try (
                Scanner s = new Scanner(
                        new BufferedReader(
                                new FileReader("xanadu.txt")
                        )
                )
        ){
            s.useDelimiter(",\\s");
            while (s.hasNext()) {
                System.out.println(s.next());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
