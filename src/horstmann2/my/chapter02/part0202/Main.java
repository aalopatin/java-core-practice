package horstmann2.my.chapter02.part0202;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        try (FileOutputStream fileOutputStream = new FileOutputStream("files\\data.dat")) {
            DataOutput output = new DataOutputStream(fileOutputStream);
            output.writeUTF("1234");
        }
        try(FileInputStream inputStream = new FileInputStream("files\\data.dat")) {
            DataInput input = new DataInputStream(inputStream);
            System.out.println(input.readUTF());
        }
    }
}
