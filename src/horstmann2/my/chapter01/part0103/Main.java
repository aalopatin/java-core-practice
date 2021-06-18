package horstmann2.my.chapter01.part0103;

import horstmann2.my.chapter01.util.StreamsUtil;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {

        Path path = Paths.get("D:\\text.txt");
        var contents = Files.readString(path);
        List<String> words = Arrays.stream(contents.split("\\PL+")).toList();

        //filter
        System.out.println(words.stream().filter(s -> s.length() < 5).toList());

        //map - parseInt
        ArrayList<String> numbersList = new ArrayList<>() {{
           add("1");
           add("2");
           add("3");
           add("4");
           add("5");
        }};

        int[] arrayInt = numbersList.stream().mapToInt(Integer::parseInt).toArray();
        System.out.println(arrayInt.toString());

        //map - Stream<Stream>
        Stream<Stream<String>> result = words.stream().map(s -> StreamsUtil.codePoints(s));
        System.out.println(
                result.map(
                        stringStream -> stringStream.toList()
                ).toList()
        );

        //flatMap
        System.out.println(
                words.stream().flatMap(s -> StreamsUtil.codePoints(s)).toList()
        );
    }
}
