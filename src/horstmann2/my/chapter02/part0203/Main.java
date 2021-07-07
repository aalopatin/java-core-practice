package horstmann2.my.chapter02.part0203;

import java.io.*;

public class Main {
    public static void main(String[] args) {
//        try(FileOutputStream fos = new FileOutputStream("files\\data.dat");
//            ObjectOutputStream oos = new ObjectOutputStream(fos)
//        ) {
//
//            Detail detail = new Detail("Main detail", 12345, "tran constructor");
//
//            System.out.println(detail);
//
//            oos.writeObject(detail);
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        try(FileInputStream fis = new FileInputStream("files\\data.dat");
            ObjectInputStream ois = new ObjectInputStream(fis)
        ) {

            Detail detail = (Detail) ois.readObject();
            System.out.println(detail);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
