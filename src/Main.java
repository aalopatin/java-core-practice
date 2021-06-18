import java.io.*;
import java.nio.CharBuffer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.time.Duration;
import java.time.Instant;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        int count = Integer.parseInt(args[0]);

        List<String> arrayList = new ArrayList<>() {{
            add("String0");
            add("String1");
            add("String2");
            add("String3");
            add("String4");
            add("String5");
            add("String6");
            add("String7");
            add("String8");
            add("String9");
        }};
        List<String> linkedList = new LinkedList<>()  {{
            add("String0");
            add("String1");
            add("String2");
            add("String3");
            add("String4");
            add("String5");
            add("String6");
            add("String7");
            add("String8");
            add("String9");
        }};


        List<String> stringList = Collections.unmodifiableList(arrayList);
//        stringList.add("String10");
        System.out.println(stringList.toString());

    }
}
