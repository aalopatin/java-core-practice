package horstmann2.my.chapter01.part0104;

import horstmann2.my.chapter01.util.StreamsUtil;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        List<String> words = StreamsUtil.listFromFile("D:\\text.txt");

        //takeWhile and dropWhile
        System.out.println(
                words.stream().takeWhile(s -> s.length() < 6).toList()
        );
        System.out.println(
                words.stream().dropWhile(s -> s.length() < 6).limit(10).toList()
        );

        //concat
        System.out.println(
                Stream.concat(
                        StreamsUtil.codePoints("Hello, "),
                        StreamsUtil.codePoints("World")
                ).toList()
        );

    }
}
