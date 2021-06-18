package horstmann2.my.chapter02.part0201;

import java.io.*;

public class CopyLines {
    public static void main(String[] args) {
        try (
                BufferedReader inputStream = new BufferedReader(new FileReader("xanadu.txt"));
                PrintWriter outputStream = new PrintWriter(new FileWriter("characteroutput.txt"), true)
        ){
            String l;
            while ((l = inputStream.readLine()) != null) {
                outputStream.println(l);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
